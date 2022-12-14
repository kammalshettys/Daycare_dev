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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import utility.FileUtil;

public class StudentFactory {
    private static StudentFactory instance;

    private StudentFactory(){
        instance = null;
    }

    public static synchronized StudentFactory getInstance(){
        if(instance == null){
            instance = new StudentFactory();
        }
        return instance;
    }
    
    public static void deletObj(int index) {
        
        School.students.remove(index);
//        School.addStudent(tmpstudent);
       
    }

    public static void addStudentObject(String fileName, String studentData) {
        FileUtil fu =  new FileUtil();
        fu.fileStudentWriter(studentData, fileName);
    }

    public Student getObject(int ID, Date DOB, int age, String name, double gpa,
                     String contactName, String emergencyPhone,
                     Date MMRDoseOne, Date MMRDoseTwo, Date varicellaDoseOne,
                     Date varicellaDoseTwo,
                     String teacher){

        return new Student(ID, DOB, age, name,  gpa,
        contactName, emergencyPhone, MMRDoseOne, MMRDoseTwo, varicellaDoseOne
                , varicellaDoseTwo, teacher);
    }
    public Student getObject(){
        return new Student();
    }
}

