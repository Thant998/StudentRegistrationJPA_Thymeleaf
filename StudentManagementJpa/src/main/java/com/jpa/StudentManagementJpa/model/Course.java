package com.jpa.StudentManagementJpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Course {

    @Id
    @Column(name = "class_id")
    private String classid;

    @NotEmpty(message = "Name cannot be blank!!")
    @Column(name = "class_name")
    private String classname;

	public String getClassid() {
		return classid;
	}

	public void setClassid(String classid) {
		this.classid = classid;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}
    
}
