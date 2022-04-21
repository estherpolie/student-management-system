package net.javaguides.sms.service;

import java.util.*;
import net.javaguides.sms.entity.*;


public interface StudentService
{
    List<Student> getAllStudents();
    
    Student saveStudent(Student student);
    
    Student getStudentById(Long id);
    Student updateStudent(Student student);
    void deleteStudentById(Long id);

}
