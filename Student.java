/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student;

/**
 *
 * @author pc
 */
public class Student {

    private int studentID;
    private String fullName;
    private int age;
    private String gender;
    private String department;
    private double GPA;

    public Student(int studentID, String fullName, int age, String gender, String department, double GPA) 
    {
        
        this.studentID = studentID;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.GPA = GPA;
        
    }

    public int getStudentID() 
    {
        
        return studentID;
        
    }

    public String getFullName()
    {
        
        return fullName;
        
    }

    public int getAge()
    {
        
        return age;
        
    }

    public String getGender() 
    {
        
        return gender;
        
    }

    public String getDepartment() 
    {
        
        return department;
        
    }

    public double getGPA()
    {
        
        return GPA;
        
    }

    public void setStudentID(int studentID) 
    {
        
        this.studentID = studentID;
        
    }

    public void setFullName(String fullName) 
    {
        
        this.fullName = fullName;
        
    }

    public void setAge(int age) 
    {
        
        this.age = age;
        
    }

    public void setGender(String gender) 
    {
        
        this.gender = gender;
        
    }

    public void setDepartment(String department) 
    {
        
        this.department = department;
        
    }

    public void setGPA(double GPA) 
    {
        
        this.GPA = GPA;
        
    }
    
    public String lineRepresentationOfStudent()
    {
        
        return studentID + "," + fullName + "," + age + "," + gender + "," + department + "," +GPA;
        
    }
    
}
