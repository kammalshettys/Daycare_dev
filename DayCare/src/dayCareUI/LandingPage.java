/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayCareUI;

import Classes.Demo;
import Classes.School;
import Classes.Student;
import Classes.StudentFactory;
import Classes.Teacher;
import java.awt.Container;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JSplitPane;
import utility.FileUtil;

/**
 *
 * 
 */
public class LandingPage extends javax.swing.JFrame {

    /**
     * Creates new form LandingPage
     */
    public LandingPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        menuPanel = new javax.swing.JPanel();
        btnStudent = new javax.swing.JButton();
        btnTeacher = new javax.swing.JButton();
        btnSummary = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        contentViewPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuPanel.setBackground(new java.awt.Color(56, 118, 208));

        btnStudent.setText("Student");
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });

        btnTeacher.setText("Teacher");
        btnTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeacherActionPerformed(evt);
            }
        });

        btnSummary.setText("Summary");
        btnSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSummaryActionPerformed(evt);
            }
        });

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTeacher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnSummary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(btnStudent)
                .addGap(50, 50, 50)
                .addComponent(btnTeacher)
                .addGap(54, 54, 54)
                .addComponent(btnSummary)
                .addGap(53, 53, 53)
                .addComponent(jButton1)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(menuPanel);

        contentViewPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to the Day Care Application !!!");

        javax.swing.GroupLayout contentViewPanelLayout = new javax.swing.GroupLayout(contentViewPanel);
        contentViewPanel.setLayout(contentViewPanelLayout);
        contentViewPanelLayout.setHorizontalGroup(
            contentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentViewPanelLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        contentViewPanelLayout.setVerticalGroup(
            contentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentViewPanelLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(contentViewPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        // TODO add your handling code here:\
        StudentMenu studentDashboardObj = new StudentMenu();
        splitPane.setRightComponent(studentDashboardObj);
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeacherActionPerformed
        // TODO add your handling code here:
        TeacherMenu teacherDashboardObj = new TeacherMenu();
        splitPane.setRightComponent(teacherDashboardObj);
    }//GEN-LAST:event_btnTeacherActionPerformed

    private void btnSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSummaryActionPerformed
        // TODO add your handling code here:
        SummaryPage summaryPageObj = new SummaryPage();
        splitPane.setRightComponent(summaryPageObj);
    }//GEN-LAST:event_btnSummaryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO Need to update the CSV before pushing the data to CSV
        School instance = School.getInstance();
        Vector<String> teachList = new Vector<>();
        Path teacherPathToDumpFile = Paths.get("", "src", "Resources", "Teachers.csv");
        String teacherCsvFile = teacherPathToDumpFile.toAbsolutePath().toString();
        FileUtil fu = new FileUtil();
        List<String> teacherData = new ArrayList<String>();
        SimpleDateFormat mdyFormat = new SimpleDateFormat("MM-dd-yyyy");

        for (Teacher tk : instance.teacherlist) {
//            System.out.println(mdyFormat.format(tk.getDateOfBirth()));
            teacherData.add("" + tk.getId() + "," + mdyFormat.format(tk.getDateOfBirth()) + "," + tk.getAge() + "," + tk.getName() + "," + tk.getCredits() + "," + tk.getSalary());
        }
        String[] teacherDataArr = new String[teacherData.size()];
        teacherData.toArray(teacherDataArr);
        fu.fileWriter(teacherDataArr, teacherCsvFile);
        // int id, Date dob, int age, String name, double gpa, String contactName, String emergencyPhone, Date mmrVacc1, Date mmrVacc2, Date varicella1, Date varicella2
        // ﻿1001, 20-12-2021, 4, Nithin, 3.4, Nikhil, 6176859600, 24-04-2021,24-04-2021,, List<String> studentData = new ArrayList<String>();
        Path relativePathToDumpFile = Paths.get("", "src", "Resources", "Students.csv");
        String studentCsvFile = relativePathToDumpFile.toAbsolutePath().toString();
        List<String> studentData = new ArrayList<String>();
        for (Student student : instance.studentlist) {
            String mmr1stDose = "";
            try{
                mmr1stDose = mdyFormat.format(student.getMmrVaccine1stDose());
            }catch(Exception e){
                
            }
            
            String mmr2ndDose = "";
            try{
                mmr2ndDose = mdyFormat.format(student.getMmrVaccine2ndDose());
            }catch(Exception e){
                
            }
            
            String varicella1stDose = "";
            try{
                varicella1stDose = mdyFormat.format(student.getVaricella1stDose());
            }catch(Exception e){
                
            }
            
            String varicella2ndDose = "";
            try{
                varicella2ndDose = mdyFormat.format(student.getVaricella2ndDose());
            }catch(Exception e){
                
            }
            

            studentData.add("" + student.getId() + "," + mdyFormat.format(student.getDateOfBirth()) + "," + student.getAge()+ "," + student.getName() + "," + student.getGpa()+ "," + student.getEmergencyName()+ "," + student.getEmergencyPhone()+ "," + mmr1stDose + "," + mmr2ndDose + "," + varicella1stDose + "," + varicella2ndDose);
        }
        String[] studentDataArr = new String[studentData.size()];
        studentData.toArray(studentDataArr);
        fu.fileWriter(studentDataArr, studentCsvFile);

        Container frame = jButton1.getParent();
            do 
                frame = frame.getParent(); 
            while (!(frame instanceof JFrame));                                      
            ((JFrame) frame).dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton btnSummary;
    private javax.swing.JButton btnTeacher;
    private javax.swing.JPanel contentViewPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
