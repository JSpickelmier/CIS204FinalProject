/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab9;

/**
 *
 * @author Jacks
 */
public class Student { 
       private String StudentID;
       private String firstName;
       private String lastName;

       
       public Student(String StudentId, String firstName, String lastName){
            this.StudentID = StudentID;
            this.firstName = firstName;
            this.lastName = lastName;
       }
    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
       
       
    }

   
    
   
    
    
    

