package com.sample.service;

import com.sample.entity.UserData;
import com.sample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<UserData> getUserDetail(int id)
    {
        return userRepository.getUserData(id);
    }
}
