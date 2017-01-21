/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.naya.dao;

import edu.lfa.naya.entity.Student;
import java.util.List;

/**
 *
 * @author Hp
 */
public interface StudentDao {
    int insert(Student s);
    List<Student> getAll();
    void delbyID(int id);
}
