/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.naya.dao.impl;

import edu.lfa.naya.dao.StudentDao;
import edu.lfa.naya.entity.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentsdaoImpl implements StudentDao {
    private static List<Student> stdlist = new ArrayList<>();

    public int insert(Student s) {
        stdlist.add(s);
        return 1;
    }

    public List<Student> getAll() {
        return stdlist;
    }

    @Override
    public void delbyID(int id) {
    for (Student sal : stdlist) {
                        if (id == sal.getId()) {
                            stdlist.remove(sal);
                            System.out.println("Sucessfilly Deleted");
                        } else {
                            System.out.println("Data not deleted");
                        }    
    }

}
}
