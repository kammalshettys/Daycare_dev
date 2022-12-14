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
public class Person {
    private int ID;
    private Date DOB;
    private int age;
    private String name;
    private ClassRoom classRoom;
    private Date MMRDoseOne;
    private Date MMRDoseTwo;
    private Date VaricellaDoseOne;
    private Date VaricellaDoseTwo;
    private String emergencyName;
    private String emergencyPhone;

    public String getEmergencyName() {
        return emergencyName;
    }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    public Date getMMRDoseOne() {
        return MMRDoseOne;
    }

    public void setMMRDoseOne(Date MMRDoseOne) {
        this.MMRDoseOne = MMRDoseOne;
    }
    public Date getMMRDoseTwo() {
        return MMRDoseTwo;
    }

    public void setMMRDoseTwo(Date MMRDoseTwo) {
        this.MMRDoseTwo = MMRDoseTwo;
    }
    public Date getVaricellaDoseOne() {
        return VaricellaDoseOne;
    }

    public void setVaricellaDoseOne(Date Varicella1stDose) {
        this.VaricellaDoseOne = Varicella1stDose;
    }
    public Date getVaricellaDoseTwo() {
        return VaricellaDoseTwo;
    }

    public void setVaricellaDoseTwo(Date Varicella2ndDose) {
        this.VaricellaDoseTwo = Varicella2ndDose;
    }
    public ClassRoom getClassRoom(){
        return classRoom;
    }
    public Person(){

    }
    public Person(int id, Date DOB, int age, String name,
            String contactName,String emergencyPhone,
            Date MMRDoseOne, Date MMRDoseTwo,
            Date varicellaDoseOne, Date varicellaDoseTwo){
        this.DOB = DOB;
        this.ID = id;
        this.age = age;
        this.name = name;
        this.emergencyPhone = emergencyPhone;
        this.emergencyName = contactName;
        this.VaricellaDoseOne = varicellaDoseOne;
        this.VaricellaDoseTwo = varicellaDoseTwo;
        this.MMRDoseOne = MMRDoseOne;
        this.MMRDoseTwo = MMRDoseTwo;
    }
    
    public Person(int id, Date dateOfBirth, int age, String name){
        this.DOB = dateOfBirth;
        this.ID = id;
        this.age = age;
        this.name = name;
    }

    public Date getDOB() {
        return DOB;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassRoom getClassroom(){
        return this.classRoom;
    }
    public void setClassroom(ClassRoom classroom){
        this.classRoom = classroom;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
