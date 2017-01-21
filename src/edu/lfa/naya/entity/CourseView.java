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
public class CourseView {
    Scanner input = new Scanner(System.in);
    List<Course> clist = new ArrayList<>();
    
    public CourseView(Scanner input, List<Course> clist) {
        this.input=input;
        this.clist=clist;
    
    }
    
    public void menu()
    {
         System.out.println("About Course:");
        System.out.println("1.Add ");
        System.out.println("2.Show all");
        System.out.println("3.Delete");
    }
     
    public void add(){
                Course c=new Course();
                System.out.println("Enter Student id");
                c.setId(input.nextInt());
                System.out.println("Enter course name");
                c.setCourse_name(input.next());
                System.out.println("Enter Price");
                c.setPrice(input.next());
                System.out.println("Enter Duration of course");
                c.setDuration(input.nextInt());
                System.out.println("Enter Duration type");
                c.setDuration_type(input.next());
                clist.add(c);
           
    }
    
    public void show(){
        for(Course c: clist){
            System.out.println(c.toString());
        }
    }
    
    public void delete(){
      System.out.println("Enter student id");
        int sid = input.nextInt();
        for (Course s : clist) {
            if (sid == s.getId()) {
                clist.remove(s);
                System.out.println("Sucessfilly Deleted");
                return;
            }

        }
                
        System.out.println("Not deleted");
    }
    
    public void controller(){
        while(true){
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
    

