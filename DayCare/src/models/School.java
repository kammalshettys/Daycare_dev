/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * 
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class School {
    public static List<ClassRoom> classrooms;
    public static List<Student> students;
    public static List<Teacher> teachers;

    private static final School instance = new School();
    private School (){
        classrooms = new ArrayList<>();
        teachers = new ArrayList<>();
        students = new ArrayList<>();
    }
    public static School getInstance( ) {
        return instance;
    }

    public static void addStudent(Student person){
        students.add(person);
    }
    public static void addTeacher(Teacher person){
        teachers.add(person);
    }
    public static void addClassRoom(ClassRoom classroom){classrooms.add(classroom);}

    public static List<ClassRoom> getClassRooms() {return getClassRooms(null);}
    public static List<Student> getStudents() {return getStudentlist(null);}
    public static List<Teacher> getTeachers() {return getTeacherlist(null);}

    public static List<ClassRoom> getClassRooms(Comparator<ClassRoom> c) {
        classrooms.sort(c);
        return classrooms;
    }
    public static List<Student> getStudentlist(Comparator<Student> c) {
        students.sort(c);
        return students;
    }
    public static List<Teacher> getTeacherlist(Comparator<Teacher> c) {
        teachers.sort(c);
        return teachers;
    }

    public static void viewStudentInformation(){
        System.out.println("****** Viewing Student list ******");
        students.forEach(System.out::println);
        System.out.println();
    }
    
    public static void viewTeacherInformation(){
        System.out.println("****** Viewing Teacher list ******");
        teachers.forEach(System.out::println);
        System.out.println();
    }
    
}