package com.jpa.StudentManagementJpa.dao;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jpa.StudentManagementJpa.model.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

    List<Student> findByStudentid(String studentId);

    @Modifying
    @Transactional
    @Query(value = "delete from student s where s.student_id = ?1", nativeQuery = true)
    void deleteStudentById(String id);

    List<Student> findDistinctByStudentidContainingOrStudentnameContainingOrAttendCourses_ClassnameContaining(String studentId, String studentName, String courseName);

}
