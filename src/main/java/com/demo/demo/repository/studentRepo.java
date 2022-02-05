package com.demo.demo.repository;

import com.demo.demo.entity.students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepo extends JpaRepository<students,Long> {

}
