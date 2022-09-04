package com.jpa.StudentManagementJpa.controller;

import java.text.SimpleDateFormat;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jpa.StudentManagementJpa.dao.UserRepository;
import com.jpa.StudentManagementJpa.model.User;


@Controller
public class LoginController {

@Autowired
UserRepository userRepository;

    @GetMapping(value="/menu")
	public String menu() {
	return "MNU001";
	}
	
	@GetMapping(value="/")
	public String login() {
	return "LGN001";
	}
	
	@PostMapping(value = "/welcomepage")
	public String finalexampage(@RequestParam("email") String email, @RequestParam("password") String password, HttpSession session,ModelMap model) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date(System.currentTimeMillis());
		String currentDate = formatter.format(date);
		if(userRepository.existsByEmailAndPassword(email, password)  ) {
			User res = userRepository.findByEmail(email);
			session.setAttribute("userInfo", res);
			session.setAttribute("date", currentDate);
			return "MNU001";
		}else {
			model.addAttribute("error","Email and Passwords do not match!!");
			return "LGN001";
		}
	}

	

    @GetMapping(value = "/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("userInfo");
		return "redirect:/";
	}
}


