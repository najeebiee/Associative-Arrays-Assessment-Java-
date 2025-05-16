/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapantas_TLA2 {

    public static void main(String[] args) {
        
        HashMap<String, Integer> studentGrades = new HashMap<>();
        Scanner s = new Scanner(System.in);
        
        String search;
        boolean running = true;
        
        studentGrades.put("Freesia", 99);
        studentGrades.put("Cheska", 98);
        studentGrades.put("Najeeb", 97);
        studentGrades.put("Natalio", 96);
        studentGrades.put("Kristine", 95);
        studentGrades.put("Jasmine", 94);
        studentGrades.put("Joshua", 93);
        
        
        while (running) {
            
            int choice;
            System.out.println("\nStudent Grades Management");
            
            System.out.println("[1] - View All Students & Grades\n" +
                               "[2] - Add Student & Grade\n" +
                               "[3] - Update Student's Grade\n" +
                               "[4] - Exit Program");
            System.out.print("Option : ");
            choice = s.nextInt();
            
            switch (choice) {
                
                case 1:
                    System.out.println("\nStudents List\n");
                    for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
                    
                        String key = entry.getKey();
                        Integer value = entry.getValue();
                        
                        System.out.println(key + " : " + value);
                        
                    }
                    break;
                case 2:
                    
                    s.nextLine();
                    System.out.print("Add Student : ");
                    String name = s.nextLine();
                    System.out.print("\nAdd Grade : ");
                    int grade = s.nextInt();
                    
                    studentGrades.put(name, grade);
                    System.out.println("Student Grade Added Successfully");
                    break;
                    
                case 3:
                    s.nextLine();
                    
                    String searchName = "";
                    
                    while (!studentGrades.containsKey(searchName)) {
                        
                    System.out.print("Enter Student's name to update : ");
                    searchName = s.nextLine();
                        
                        if (studentGrades.containsKey(searchName)) {
                            System.out.print("Enter New Grade : ");
                            int newGrade = s.nextInt();
                            studentGrades.put(searchName, newGrade);

                            System.out.println("Student Grade Updated Successfully!");
                            break;

                        } else {
                            System.out.println("Student is not on the list");
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("Exiting Program....");
                    running = false;
            }
            
        }
        
    }
    
}
