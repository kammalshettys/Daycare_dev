package controllers;

import models.*;
import utility.FileUtil;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentController {

    private static StudentController instance;

    private StudentController(){
        instance = null;
    }

    public static StudentController getInstance(){
        if (instance == null){
            instance = new StudentController();
        }
        return instance;
    }

    public List<Person> addObject(String csvFile) {
        FileUtil fu = new FileUtil();
        System.out.println("Inside addObject method");
        List<String> fileOutput = fu.filereader(csvFile);
        Person tmpStudent = null;
        List<Person> tmplist = new ArrayList<>();
        for (String inputLine : fileOutput) {
            try{
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
                }
                int age = Integer.parseInt(values[2]);
                String name = values[3];
                double gpa = Double.parseDouble(values[4]);
                String contactName = values[5];
                String contactPhone = values[6];

                Date mmrVacc1 = null;
                try{
                    String mmrVaccine1 = values[7];
                    mmrVacc1 = new SimpleDateFormat("MM-dd-yyyy").parse(mmrVaccine1);
                }catch(Exception e){
                }
                Date mmrVacc2 = null;
                try{
                    String mmrVaccine2 = values[8];
                    mmrVacc2 = new SimpleDateFormat("MM-dd-yyyy").parse(mmrVaccine2);
                }catch(Exception e){
                }
                Date varicellaVacc1 = null;
                try{
                    String varicella1 = values[9];
                    varicellaVacc1 = new SimpleDateFormat("MM-dd-yyyy").parse(varicella1);
                }catch(Exception e){
                }
                Date varicellaVacc2 = null;
                try{
                    String varicella2 = values[10];
                    varicellaVacc2 = new SimpleDateFormat("MM-dd-yyyy").parse(varicella2);
                }catch(Exception e){
                }

                tmpStudent = getObject(id, dob, age, name, gpa,
                        contactName, contactPhone, mmrVacc1, mmrVacc2, varicellaVacc1,
                        varicellaVacc2,null);
                tmplist.add(tmpStudent);
            }catch(Exception e){
                System.err.println("Exception ocurred : " + e.getStackTrace()[0].getLineNumber());
            }

        }
        return tmplist;
    }

    public Student getObject(int id, Date dob, int age, String name,
                                    double gpa, String contactName, String emergencyPhone,
                                    Date mmrVacc1, Date mmrVacc2,
                                    Date varicella1, Date varicella2, String teacher ) {

        Student tmpstudent = new Student(id, dob, age, name, gpa,
                contactName, emergencyPhone, mmrVacc1, mmrVacc2,
                varicella1,  varicella2,teacher);
        School.addStudent(tmpstudent);
        addClassRoom(tmpstudent);
        return tmpstudent;
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

    public Student getObj(int id, Date dob, int age, String name,
                                 double gpa, String contactName,String emergencyPhone,
                                 Date mmrVacc1, Date mmrVacc2,
                                 Date varicella1, Date varicella2,int index,String teacher ) {

        Student tmpstudent = new Student(id, dob, age, name, gpa,
                contactName, emergencyPhone, mmrVacc1, mmrVacc2,
                varicella1,  varicella2,teacher);
        School.students.set(index, tmpstudent);
//        School.addStudent(tmpstudent);
        return tmpstudent;
    }

    public List<String> teachList(int age){
        List<String> teacherList = School.teachers.stream()
                .filter(e-> (e.getAgeGroupAssigned().equalsIgnoreCase(Student.getAgeGroupMapping(age)))&&Demo.studentRatioRules.get(Student.getAgeGroupMapping(age))>e.getStudentCount())
                .map(e->{return e.getName();}).collect(Collectors.toList());
        System.out.println(teacherList);
        return teacherList;
    }

}
