/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
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
    
    private int capacity;
//    private List<Teacher> teacherList = new ArrayListeacherStudentGroupt<>();
    public Map<Teacher, List<Student>> teacherStudentGroup;
  //  public Map<String, List<Student>> studentTeacherGroup;

    private String name;
//    private List<Student> studentList = new ArrayList<>();
    public ClassRoom(){
      
       
    }
    public ClassRoom(String name){
        this.name = name;
        teacherStudentGroup = new HashMap<Teacher, List<Student>>();
       
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

//    public List<Student> getStudentList() {
//        return studentList;
//    }
//
//    public void setStudentList(List<Student> studentList) {
//        this.studentList = studentList;
//    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int compareTo(ClassRoom o) {
        return Integer.compare(this.getCapacity(), o.getCapacity());
    }

//    public ClassRoom(String name, Teacher headTeacher) {
//        this.name = name;
//        studentList = new ArrayList<>();
//        this.teacher = headTeacher;
//    }
    
}
