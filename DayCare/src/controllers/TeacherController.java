package controllers;

import models.*;
import utility.FileUtil;

import java.text.SimpleDateFormat;
import java.util.*;

public class TeacherController {

    private static TeacherController instance;

    TeacherController(){
        instance = null;
    }

    public static TeacherController getInstance(){
        if (instance == null){
            instance = new TeacherController();
        }
            return instance;
    }

    public List<Person> addObject(String csvFile) {

        FileUtil fu = new FileUtil();
        List<String> fileOutput = fu.filereader(csvFile);
        Person tmpTeacher = null;

        List<Person> tmplist = new ArrayList<>();
        for (String inputLine : fileOutput) {
            String[] values = inputLine.split(",");
            int id;
            try{
                id =Integer.parseInt(values[0]);
            }catch(java.lang.NumberFormatException e){
                id =Integer.parseInt(values[0].substring(1));
            }
            String dateOfBirthStr = values[1];
            Date dob = null;
            try{
                dob = new SimpleDateFormat("MM-dd-yyyy").parse(dateOfBirthStr);
            }catch(Exception e){
                System.err.println("Exception ocurred : " + e);
            }

            int age = Integer.parseInt(values[2]);
            String name = values[3];
            int credits = Integer.parseInt(values[4]);
            int salary = Integer.parseInt(values[5]);
            String ageGroup = values[6];
            tmpTeacher = TeacherFactory.getObject(id, dob, age, name, credits, salary,ageGroup);
            tmplist.add(tmpTeacher);
        }
        return tmplist;
    }

    public void addClassRoom(Student student){
        // List<Teacher> teachList =  School.teacherlist;
        //  List<Teacher> teachList = School.teacherlist.stream().filter(e->e.getName().equalsIgnoreCase(student.getTeacherAssigned())).collect(Collectors.toList());
        //   System.out.println()
        Optional<Teacher> t = School.teachers.stream().filter(e->e.getName().equalsIgnoreCase(student.getTeacherAssigned())).findFirst();
        Teacher teacher = t.get();
        teacher.setStudentCount(teacher.getStudentCount()+1);
        Optional<ClassRoom> cl = School.classrooms.stream().filter(e->e.teacherStudentGroup.containsKey(teacher)).findAny();
        ClassRoom classRoom = null;
        if(cl.isPresent()){
            classRoom = cl.get();
        }
        else
        {
            classRoom = new ClassRoom();
            classRoom.setCapacity(0);
        }

        classRoom.setCapacity(classRoom.getCapacity()+1);
        List<Student> std = classRoom.teacherStudentGroup.get(teacher);
        std.add(student);
        //     System.out.println(classRoom.teacherStudentGroup);

    }

    public List<String> getAgeGroup(){
        List<String> ageGroup = new ArrayList<String>();
        for(Map.Entry<String,Integer>entry: Demo.studentRatioRules.entrySet()){
            long teacherCount = School.getTeachers().stream().filter(t -> entry.getKey().equals(t.getAgeGroupAssigned())).count();
            if((entry.getKey().equals("48-59")||entry.getKey().equals("60-Above"))&&teacherCount<2)
                ageGroup.add(entry.getKey());
            else if(teacherCount<3)
                ageGroup.add(entry.getKey());
        }
        return ageGroup;
    }
}

