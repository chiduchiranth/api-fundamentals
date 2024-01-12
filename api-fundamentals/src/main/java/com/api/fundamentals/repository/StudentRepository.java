package com.api.fundamentals.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.fundamentals.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>  {

}
