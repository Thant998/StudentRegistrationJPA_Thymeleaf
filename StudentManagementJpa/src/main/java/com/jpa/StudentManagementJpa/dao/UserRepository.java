package com.jpa.StudentManagementJpa.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.StudentManagementJpa.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, String>{
    
    public List<User> findByUseridContainingOrUsernameContaining(String userid, String username);
    public User findByUserid(String userid);
    public User findByEmail(String email);
    public boolean existsByEmailAndPassword(String email, String password);
    public void deleteByUserid(String userId);
    public boolean existsByEmail(String userEmail);
    
}
