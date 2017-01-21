
package edu.lfa.naya.dao;

import edu.lfa.naya.entity.Course;
import java.util.List;

public interface CourseDao {
    int insert(Course c);
    List<Course> getAll();
    void delbyID(int id);
}
