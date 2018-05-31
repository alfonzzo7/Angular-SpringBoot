package com.pherrera.userportalback.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pherrera.userportalback.entity.User;
import com.pherrera.userportalback.repository.UserRepository;
import com.pherrera.userportalback.services.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
    private UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(int id) {
    	return userRepository.findById(id);
    }

    @Override
    public User update(User user) {
    	return userRepository.save(user);
    }

}
