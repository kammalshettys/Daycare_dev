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
public class Teacher extends Person implements Comparable<Teacher>{
    
    private int credits;
    private int salary;
    private String annualReview;
    private String ageGroupAssigned;
//    private int maxAge;
//    private int minAge;
//
//    public void setMaxAge(int maxAge){
//        this.maxAge = maxAge;
//    }
//    public void setMinAge(int minAge){
//        this.minAge = minAge;
//    }
//    
//    public int getMaxAge(){
//        return this.maxAge;
//    }
//    
//    public int getMinAge(){
//        return this.minAge;
//    }

    public String getAgeGroupAssigned() {
        return ageGroupAssigned;
    }

    public void setAgeGroupAssigned(String ageGroupAssigned) {
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

    public void setCredits(int credits) {
        this.credits = credits;
    } 
    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public Teacher(int id, Date dob, int age, String name, int credits, int salary, String ageGroup){
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
        return Integer.compare(this.getId(), o.getId());
    }
}
