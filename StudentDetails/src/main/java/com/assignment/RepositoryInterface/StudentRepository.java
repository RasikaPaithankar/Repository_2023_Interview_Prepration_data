package com.assignment.RepositoryInterface;

import org.springframework.data.repository.CrudRepository;

import com.assignment.Entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
