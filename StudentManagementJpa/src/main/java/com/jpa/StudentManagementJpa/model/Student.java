package com.jpa.StudentManagementJpa.model;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Student {

    @Id
    @Column(name = "student_id")
    private String studentid;

    @Column(name = "student_name")
    @NotEmpty(message = "Name cannot be blank.")
    private String studentname;

    @NotEmpty(message = "Date of birth cannot be blank.")
    private String dob;
    @NotEmpty(message = "Select your gender.")
    private String gender;
    @NotEmpty(message = "Enter your phone number.")
    private String phone;
    @NotEmpty(message = "Education cannot be blank.")
    private String education;

    @NotEmpty(message = "Please select the course(s) you want to attend!!")
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "student_course", 
        joinColumns = @JoinColumn(name = "student_id"), 
        inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> attendCourses;

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public List<Course> getAttendCourses() {
		return attendCourses;
	}

	public void setAttendCourses(List<Course> attendCourses) {
		this.attendCourses = attendCourses;
	}
    
}
