/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.naya.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class StudentView {

    Scanner input = new Scanner(System.in);
    List<Student> stdlist = new ArrayList<>();

    public StudentView(Scanner input, List<Student> stdlist) {
        this.input = input;
        this.stdlist = stdlist;

    }

    public void menu() {
        System.out.println("Menu student:");
        System.out.println("1.Add Student");
        System.out.println("2.Show all");
        System.out.println("3.Delete");
    }

    public void add() {
        Student s = new Student();
        System.out.println("Enter student ID");
        s.setId(input.nextInt());
        System.out.println("Enter first name:");
        s.setFname(input.next());
        System.out.println("Enter Last name:");
        s.setLname(input.next());
        System.out.println("Enter email:");
        s.setEmail(input.next());

        stdlist.add(s);
    }

    public void show() {
        for (Student s : stdlist) {
            System.out.println(s.toString());
        }
    }

    public void delete() {
        System.out.println("Enter student id");
        int sid = input.nextInt();
        for (Student s : stdlist) {
            if (sid == s.getId()) {
                stdlist.remove(s);
                System.out.println("Sucessfilly Deleted");
                return;
            }

        }
                
        System.out.println("Not deleted");
    }

    public void controller() {
        while (true) {
            menu();
            System.out.println("Enter a choice[1-3]");
            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    add();
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    delete();
                    break;
            }

            System.out.println("Do you want to continue[y/n]:");
            String check = input.next();
            if (check.equalsIgnoreCase("n")) {
                break;
            }
        }

    }
}
