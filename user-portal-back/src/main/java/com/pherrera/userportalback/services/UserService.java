package com.pherrera.userportalback.services;

import java.util.List;
import java.util.Optional;

import com.pherrera.userportalback.entity.User;

public interface UserService {
	
    public User create(User user);

    
    public void delete(int id);

    
    public List<User> findAll();

    
    public Optional<User> findById(int id);

    
    public User update(User user);
}
