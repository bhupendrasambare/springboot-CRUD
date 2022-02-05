package com.demo.demo.service;

import com.demo.demo.entity.students;

import java.util.List;

public interface studentService {
    public students saveStudent(students students);

    public List<students> getStudents();

    public students getStudentById(long id);

    public void deleteStudentById(long id);

    public students updateStudentById(long id, students students);
}
