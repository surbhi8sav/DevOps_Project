package com.devops.devops_project.service;

import com.devops.devops_project.model.User;
import com.devops.devops_project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User createUser(User user) {
        userRepository.save(user);
        return  user;
    }
}
