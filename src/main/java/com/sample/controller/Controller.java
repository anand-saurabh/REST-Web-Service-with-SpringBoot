package com.sample.controller;

import com.sample.entity.UserData;
import com.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/user")
    public ResponseEntity<List<UserData>> getUserDetail(
            @RequestParam(value = "userId", required = true) int userId)
    {
        List<UserData> userDetails = userService.getUserDetail(userId);
        return new ResponseEntity(userDetails,
                HttpStatus.OK);
    }

}
