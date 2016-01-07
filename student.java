/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSCI335ProjectOne;

/**
 *
 * @author Chrishon595
 */
import java.io.Serializable;


public class student implements Serializable
{
    int ID;
    String name;
    int age;
    double GPA;
    
    //constructor for student object
    public student(int ID, String name, int age, double GPA)
    {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }
    
    //no-args student constructor
    public student()
    {
        
    }
    
    //sets the ID for the student
    public void setID(int ID)
    {
        this.ID = ID;
    }
    
    //returns the ID of the student
    public int getId()
    {
        return ID;
    }
    
    //sets the name of the student
    public void setName(String name)
    {
        this.name = name;
    }
    
    //returns the name of the student
    public String getName()
    {
        return name;
               
    }
    
    //sets the age of the student
    public void setAge(int age)
    {
        this.age = age;
    }
    
    //returns the age of the student
    public int getAge()
    {
        return age;
    }
    
    //sets the GPA of the student
    public void setGPA(double GPA)
    {
        this.GPA = GPA;
    }
    
    //returns the GPA of the student
    public double getGPA()
    {
        return GPA;
    }
    
    @Override
    public String toString()
    {
        return "Student - ID number: " + ID + "   name: " + name + "      age: " + age + "      GPA: " + GPA;
    }
}
