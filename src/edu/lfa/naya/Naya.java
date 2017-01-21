
package edu.lfa.naya;

import edu.lfa.naya.entity.Course;
import edu.lfa.naya.entity.CourseView;
import edu.lfa.naya.entity.Student;
import edu.lfa.naya.entity.StudentView;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Naya {

 
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        StudentView sv = new StudentView(new Scanner(System.in), new ArrayList<>());
        List<Course> clist = new ArrayList<>();
        CourseView cv = new CourseView(new Scanner(System.in),new ArrayList<>());
        
        while(true){
        System.out.println("Main menu:");
        System.out.println("1.Student:");
        System.out.println("2.Course:");
        System.out.println("Enroll:");
       
       System.out.println("Enter your choice[1-3]:");
        int choice=input.nextInt(); 
        switch(choice){
            case 1:
                sv.controller();
                
                break;
            case 2:
                cv.controller();
                break;
            case 3:
                
                break;
            
        }
                
    }
    
}
}
