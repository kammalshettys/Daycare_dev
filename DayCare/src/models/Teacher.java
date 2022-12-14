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
public class Teacher extends Person implements Comparable<Teacher>{
    
    private final int credits;
    private final int salary;
    private String annualReview;
    private AgeGroup ageGroupAssigned;
    private int studentCount=0;

    public int getStudentCount() {
        return studentCount;
    }
    public void setStudentCount(int count) {
        this.studentCount = count;
    }
    public AgeGroup getAgeGroupAssigned() {
        return ageGroupAssigned;
    }
    public void setAgeGroupAssigned(AgeGroup ageGroupAssigned) {
        this.ageGroupAssigned = ageGroupAssigned;
    }
    public String getAnnualReview() {
        return annualReview;
    }
    public void setAnnualReview(String annualReview) {
        this.annualReview = annualReview;
    }
    public int getCredits() {
        return credits;
    }
    public int getSalary() {
        return salary;
    }

    public Teacher(int id, Date dob, int age, String name, int credits,
                   int salary, AgeGroup ageGroup){
        super(id, dob, age, name);
        this.credits = credits;
        this.salary = salary;
        this.ageGroupAssigned = ageGroup;
    }
    
    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int compareTo(Teacher o) {
        return Integer.compare(this.getID(), o.getID());
    }
}
