/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.naya.dao.impl;

import edu.lfa.naya.dao.CourseDao;
import edu.lfa.naya.entity.Course;
import edu.lfa.naya.entity.Student;
import java.util.ArrayList;
import java.util.List;

public class CourseDaoImpl implements CourseDao {
private static List<Course> clist = new ArrayList<>();
    @Override
    public int insert(Course c) {
        clist.add(c);
        return 1;
    }

    @Override
    public List<Course> getAll() {
        return clist;
    }

    @Override
    public void delbyID(int id) {
for (Course c : clist) {
                        if (id == c.getId()) {
                            clist.remove(c);
                            System.out.println("Sucessfilly Deleted");
                        } else {
                            System.out.println("Data not deleted");
                        }    
    }
    }
    
}
