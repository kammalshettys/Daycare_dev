/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * 
 */
public class Student extends Person implements Comparable<Student>{

    private double GPA;
    private AgeGroup ageGroup;
    private String teacherAssigned;
    
    public String getTeacherAssigned() {
        return teacherAssigned;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    
    public AgeGroup getAgeGroup(){
        return this.ageGroup;
    }
    
    public void setAgeGroup(AgeGroup ageGroup){
        this.ageGroup = ageGroup;
    }
    
    public Student(){

    }
    
    public Student(int ID, Date DOB, int age, String name, double gpa,
            String contactName, String emergencyPhone,
            Date MMRDoseOne, Date MMRDoseTwo, Date varicellaDoseOne,
                   Date varicellaDoseTwo,
                   String teacher){
        super(ID, DOB, age, name, contactName, emergencyPhone,
                MMRDoseOne, MMRDoseTwo, varicellaDoseOne, varicellaDoseTwo);
        this.GPA = gpa;
        this.setAgeGroup(this.getAgeGroupMapping());
        this.teacherAssigned = teacher;
    }
    
    @Override
    public String toString() {
        return getName();
    }
    
    public AgeGroup getAgeGroupMapping(){
        
        if (this.getAge() >= 6 && this.getAge() <= 12) {
            return AgeGroup._6To12;
        } else if (this.getAge() >= 13 && this.getAge() <= 24) {
            return AgeGroup._13To24;
        } else if (this.getAge() >= 25 && this.getAge() <= 35) {
            return AgeGroup._25To35;
        } else if (this.getAge() >= 36 && this.getAge() <= 47) {
            return AgeGroup._36To47;
        } else if (this.getAge() >= 48 && this.getAge() <= 59) {
            return AgeGroup._48To59;
        }
        return AgeGroup._60Above;
    }
    
    public static AgeGroup getAgeGroupMapping(int age){

        if (age >= 6 && age <= 12) {
            return AgeGroup._6To12;
        } else if (age >= 13 && age <= 24) {
            return AgeGroup._13To24;
        } else if (age >= 25 && age <= 35) {
            return AgeGroup._25To35;
        } else if (age >= 36 && age <= 47) {
            return AgeGroup._36To47;
        } else if (age >= 48 && age <= 59) {
            return AgeGroup._48To59;
        }
        return AgeGroup._60Above;
    }


    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.getID(), o.getID());
    }
}
