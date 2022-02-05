package com.demo.demo.service;

import com.demo.demo.entity.students;
import com.demo.demo.repository.studentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class studentsServiceImplimation implements studentService{

    @Autowired
    private  studentRepo studentRepo;

    @Override
    public students saveStudent(students students) {
        return studentRepo.save(students);
    }

    @Override
    public List<students> getStudents() {
        return studentRepo.findAll();
    }

    @Override
    public students getStudentById(long id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public void deleteStudentById(long id) {
        studentRepo.deleteById(id);
    }

    @Override
    public students updateStudentById(long id, students students) {
        students sFind = studentRepo.findById(id).get();
        if(Objects.nonNull(students.getAge()) && 0 != students.getAge()){
            sFind.setAge(students.getAge());
        }
        if(Objects.nonNull(students.getName()) && !"".equals(students.getName())){
            sFind.setName(students.getName());
        }
        if(Objects.nonNull(students.getEmail()) && !"".equals(students.getEmail())){
            sFind.setEmail(students.getEmail());
        }
        if(Objects.nonNull(students.getNumber()) && !"".equals(students.getNumber())){
            sFind.setNumber(students.getNumber());
        }
        return studentRepo.save(sFind);
    }
}
