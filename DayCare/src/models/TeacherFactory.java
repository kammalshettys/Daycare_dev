/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import utility.FileUtil;

import java.util.Date;

/**
 *
 * 
 */
public class TeacherFactory {
    private static TeacherFactory instance;

    private TeacherFactory(){
        instance = null;
    }

    public static synchronized TeacherFactory getInstance(){
        if(instance == null){
            instance = new TeacherFactory();
        }
        return instance;
    }

    public static Teacher getObject(int id, Date dob, int age, String name, int credits, int salary, String ageGroup){
        Teacher tmpteacher = new Teacher(id, dob, age, name, credits, salary,ageGroup);
        School.addTeacher(tmpteacher);
        return tmpteacher;
    }
    
    public static void addTeacherObject(String fileName, String teacherData) {
        FileUtil fu =  new FileUtil();
        fu.fileTeacherWriter(teacherData, fileName);
    }
}
