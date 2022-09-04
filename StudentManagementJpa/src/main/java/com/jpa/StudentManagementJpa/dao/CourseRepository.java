package com.jpa.StudentManagementJpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.jpa.StudentManagementJpa.model.Course;


@Repository
public interface CourseRepository extends JpaRepository<Course, String> {
	
    public boolean existsByClassname(String className);

}
