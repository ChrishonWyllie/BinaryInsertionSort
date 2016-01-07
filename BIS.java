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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import static java.lang.System.out;

public class BIS 
{
    public static int binarySearch (int IDs[], int smallest, int largest, int key)
    {
        int mid;

        if (smallest == largest)
            return smallest;

        mid = smallest + ((largest - smallest) / 2);

        if (key > IDs[mid])
        {
            return binarySearch (IDs, mid + 1, largest, key);
        }
        else 
            if (key < IDs[mid])
            {
            return binarySearch (IDs, smallest, mid, key);
            }

        return mid;
    }
    public static void binaryInsertionSort(int[] IDs)
    {
        int insert; 
        int i;
        int j;
        int tempVal;

        for (i = 1; i < IDs.length; i++) 
        {
            insert = binarySearch(IDs, 0, i, IDs[i]);
            if (insert < i) 
            {
                tempVal = IDs[i];
                for (j = i - 1; j >= insert; j--)
                    IDs[j + 1] = IDs[j];
                IDs[insert] = tempVal;
            }
        }
    }
    
    public static void main(String[] args)
    {   
        int[] studentIDs = new int[10];
        student student1 = new student(564345, "Will", 20, 3.7);
        student student2 = new student(845336, "John", 22, 3.6);
        student student3 = new student(324946, "Lisa", 23, 3.5);
        student student4 = new student(784358, "Alice", 21, 3.56);
        student student5 = new student(193493, "Ryan", 21, 3.8);
        student student6 = new student(934539, "Denise", 26, 3.4);
        student student7 = new student(234938, "Arnold", 26, 3.3);
        student student8 = new student(324925, "Serina", 22, 3.67);
        student student9 = new student(453224, "Michael", 27, 3.26);
        student student10 = new student(634231, "Michelle", 21, 3.63);
        
            studentIDs[0] = student1.getId();
            studentIDs[1] = student2.getId();;
            studentIDs[2] = student3.getId();
            studentIDs[3] = student4.getId();
            studentIDs[4] = student5.getId();
            studentIDs[5] = student6.getId();
            studentIDs[6] = student7.getId();
            studentIDs[7] = student8.getId();
            studentIDs[8] = student9.getId();
            studentIDs[9] = student10.getId();
        
            
        //Creates a text file and places the student objects into the file 
        //in the order that they appear. By default, they are unsorted.
            System.out.println("This is a list of students.");
            System.out.println("The list is unsorted.");
        try{
            FileWriter fw = new FileWriter("Students.txt");
            PrintWriter pw = new PrintWriter(fw);
            
            for(int i = 0; i<studentIDs.length; i++)
            {         
                if(studentIDs[i] == student1.getId())
                {
                    pw.println(student1);
                }
                else
                    if(studentIDs[i] == student2.getId())
                    {
                        pw.println(student2);
                    }
                else
                    if(studentIDs[i] == student3.getId())
                    {
                        pw.println(student3);
                    }
                else
                    if(studentIDs[i] == student4.getId())
                    {
                        pw.println(student4);
                    }
                else
                    if(studentIDs[i] == student5.getId())
                    {
                        pw.println(student5);
                    }
                else
                    if(studentIDs[i] == student6.getId())
                    {
                        pw.println(student6);
                    }
                else
                    if(studentIDs[i] == student7.getId())
                    {
                        pw.println(student7);
                    }
                else
                    if(studentIDs[i] == student8.getId())
                    {
                        pw.println(student8);
                    }
                else
                    if(studentIDs[i] == student9.getId())
                    {
                        pw.println(student9);
                    }
                else
                    if(studentIDs[i] == student10.getId())
                    {
                        pw.println(student10);
                    }
            }
            pw.close();
        }catch (IOException e) {
            out.println("ERROR!");
        }

        
        
        try{
            FileReader fr = new FileReader("Students.txt");
            BufferedReader  br = new BufferedReader(fr);
            
            String str;
            while((str = br.readLine()) != null) {
                out.println(str + "\n");
            }
            
            br.close();
        }catch (IOException e) {
            out.println("File not found!");
        }
        
        
        binaryInsertionSort(studentIDs);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        //---------------------------------------------------------
        //Places student objects into a newly created text file that is
        //now sorted.
        
        System.out.println("This is an updated version of the list");
        System.out.println("The list is now sorted using the IDs of");
        System.out.println("Each student as the key");
        try{
            FileWriter fw = new FileWriter("StudentsSORTED.txt");
            PrintWriter pw = new PrintWriter(fw);
            for(int i = 0; i<studentIDs.length; i++)
            {         
                if(studentIDs[i] == student1.getId())
                {
                    pw.println(student1);
                }
                else
                    if(studentIDs[i] == student2.getId())
                    {
                        pw.println(student2);
                    }
                else
                    if(studentIDs[i] == student3.getId())
                    {
                        pw.println(student3);
                    }
                else
                    if(studentIDs[i] == student4.getId())
                    {
                        pw.println(student4);
                    }
                else
                    if(studentIDs[i] == student5.getId())
                    {
                        pw.println(student5);
                    }
                else
                    if(studentIDs[i] == student6.getId())
                    {
                        pw.println(student6);
                    }
                else
                    if(studentIDs[i] == student7.getId())
                    {
                        pw.println(student7);
                    }
                else
                    if(studentIDs[i] == student8.getId())
                    {
                        pw.println(student8);
                    }
                else
                    if(studentIDs[i] == student9.getId())
                    {
                        pw.println(student9);
                    }
                else
                    if(studentIDs[i] == student10.getId())
                    {
                        pw.println(student10);
                    }
            }
            pw.close();
        }catch (IOException e) {
            out.println("ERROR!");
        }

        
        
        try{
            FileReader fr = new FileReader("StudentsSORTED.txt");
            BufferedReader  br = new BufferedReader(fr);
            
            String str;
            while((str = br.readLine()) != null) {
                out.println(str + "\n");
            }
            
            br.close();
        }catch (IOException e) {
            out.println("File not found!");
        }
    }
}
        
            
            
            
            
        
    
    

