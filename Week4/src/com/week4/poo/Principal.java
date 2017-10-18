package com.week4.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pepe
 */

public class Principal {
    
    static Scanner read = new Scanner(System.in);
    static List<Student> room = new ArrayList();
    
    public static void main(String[] args) {
        boolean exit = false;
        String name = "";
        int id;
        while (exit == false) {
            System.out.print("ID : ");
            id = read.nextInt();read.nextLine();
            System.out.print("Name : ");
            name = read.nextLine();
            newStudent(id, name);
            System.out.println("\nExit? (true/false) ");
            exit = read.nextBoolean();
            System.out.println("\n");
            if (exit == true) {
                showStudents();
            }
        }
        
    }
    
    public static void newStudent(int i, String n){
        Student st = new Student(i, n);
        room.add(st);
    }
    
    public static void showStudents(){
        System.out.println("///////////////////////////////");
        for (Student list : room) {
            System.out.println("ID : " + list.getId());
            System.out.println("Name : " + list.getName());
            System.out.println("**************************");
        }
        System.out.println("///////////////////////////////");
    }
    
}
