/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * 
 */
public class ClassRoom implements Comparable<ClassRoom>{
    // Can have maximum of 3 Teachers
    // Can have maximum of 30 students

    private String name;
    private int capacity;
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Map<Teacher, List<Student>> teacherStudentGroup;

    public ClassRoom(String name){
        this.name = name;
        teacherStudentGroup = new HashMap<>();
       
    }
    @Override
    public int compareTo(ClassRoom o) {
        return Integer.compare(this.getCapacity(), o.getCapacity());
    }
}
