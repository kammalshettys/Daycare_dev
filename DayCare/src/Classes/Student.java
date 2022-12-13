/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;

/**
 *
 * 
 */
public class Student extends Person implements Comparable<Student>{
    
    private double gpa;
    private String ageGroup;
    private String teacherAssigned;
    
    public String getTeacherAssigned() {
        return teacherAssigned;
    }

    public void setTeacherAssigned(String teacherAssigned) {
        this.teacherAssigned = teacherAssigned;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    public String getAgeGroup(){
        return this.ageGroup;
    }
    
    public void setAgeGroup(String ageGroup){
        this.ageGroup = ageGroup;
    }
    
    public Student(){
    
    }
    
    public Student(int id, Date dob, int age, String name, double gpa,
            String contactName, String emergencyPhone,
            Date mmrVacc1, Date mmrVacc2, Date varicella1, Date varicella2, String teacher){
        super(id, dob, age, name, contactName, emergencyPhone,
                mmrVacc1, mmrVacc2, varicella1, varicella2);
        this.gpa = gpa;
        this.setAgeGroup(this.getAgeGroupMapping());
        this.teacherAssigned = teacher;
    }
    
    public ClassRoom getClassroom() {
        return this.getClassroom();
    }
    
    @Override
    public String toString() {
        return getName();
    }
    
    public String getAgeGroupMapping(){
        
        if (this.getAge() >= 6 && this.getAge() <= 12) {
            return "6-12";
        } else if (this.getAge() >= 13 && this.getAge() <= 24) {
            return "13-24";
        } else if (this.getAge() >= 25 && this.getAge() <= 35) {
            return "25-35";
        } else if (this.getAge() >= 36 && this.getAge() <= 47) {
            return "36-47";
        } else if (this.getAge() >= 48 && this.getAge() <= 59) {
            return "48-59";
        }
        return "60-Above";
    }
    
    public static String getAgeGroupMapping(int age){
        
        if (age >= 6 && age <= 12) {
            return "6-12";
        } else if (age >= 13 && age <= 24) {
            return "13-24";
        } else if (age >= 25 && age <= 35) {
            return "25-35";
        } else if (age >= 36 && age <= 47) {
            return "36-47";
        } else if (age >= 48 && age <= 59) {
            return "48-59";
        }
        return "60-Above";
    }


    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.getId(), o.getId());
    }
}
