package com.sample.service;

import com.sample.entity.UserData;
import com.sample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<UserData> getUserDetail(String id)
    {
        return userRepository.getUserData(id);
    }

    public void saveUserData(UserData userData)
    {
        userRepository.saveUserData(userData);
    }
}
