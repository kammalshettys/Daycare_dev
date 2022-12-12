/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class School {
    public static List<ClassRoom> classrooms;
    public static List<Student> studentlist;
    public static List<Teacher> teacherlist;

    private static final School instance = new School();
    private School (){
        classrooms = new ArrayList<>();
        teacherlist = new ArrayList<>();
        studentlist = new ArrayList<>();
    }
    public static School getInstance( ) {
        return instance;
    }

    public void printClassRoominformation( ) {
//        for (ClassRoom C: classrooms) {
//            System.out.print(C.getTeacher().getName());
//        }
    }

    public static void addStudent(Student person){studentlist.add(person);}
    public static void addTeacher(Teacher person){teacherlist.add(person);}
    public static void addClassRoom(ClassRoom classroom){classrooms.add(classroom);}

    public static List<ClassRoom> getClassRooms() {return getClassRooms(null);}
    public static List<Student> getStudentlist() {return getStudentlist(null);}
    public static List<Teacher> getTeacherlist() {return getTeacherlist(null);}

    public static List<ClassRoom> getClassRooms(Comparator<ClassRoom> c) {
        classrooms.sort(c);
        return classrooms;
    }
    public static List<Student> getStudentlist(Comparator<Student> c) {
        studentlist.sort(c);
        return studentlist;
    }
    public static List<Teacher> getTeacherlist(Comparator<Teacher> c) {
        teacherlist.sort(c);
        return teacherlist;
    }

    public static void viewStudentInformation(){
        System.out.println("****** Viewing Student list ******");
        studentlist.stream().forEach(System.out::println);
        System.out.println();
    }
    
    public static void viewTeacherInformation(){
        System.out.println("****** Viewing Teacher list ******");
        teacherlist.stream().forEach(System.out::println);
        System.out.println();
    }
    
}