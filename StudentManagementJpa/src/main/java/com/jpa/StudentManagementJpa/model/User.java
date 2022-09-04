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
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class User {

    @Id
    @Column(name = "user_id")
    private String userid;

    @NotEmpty(message = "Name cannot be blank.")
    @Column(name = "user_name")
    private String username;

    @NotEmpty(message = "Email cannot be blank.")
    @Column(name = "user_email")
    private String email;

    @NotEmpty(message = "Password cannot be blank.")
    @Column(name = "user_password")
    private String password;

    @NotEmpty(message = "Confirm password cannot be blank.")
    @Column(name = "user_conpassword")
    private String conpassword;

    @NotEmpty(message = "User role cannot be blank.")
    @Column(name = "user_role")
    private String role;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConpassword() {
		return conpassword;
	}

	public void setConpassword(String conpassword) {
		this.conpassword = conpassword;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User(String userid, @NotEmpty(message = "Name cannot be blank.") String username,
			@NotEmpty(message = "Email cannot be blank.") String email,
			@NotEmpty(message = "Password cannot be blank.") String password,
			@NotEmpty(message = "Confirm password cannot be blank.") String conpassword,
			@NotEmpty(message = "User role cannot be blank.") String role) {
		super();
		this.userid = userid;
		this.username = username;
		this.email = email;
		this.password = password;
		this.conpassword = conpassword;
		this.role = role;
	}

	public User() {
		super();
	}
    
}
