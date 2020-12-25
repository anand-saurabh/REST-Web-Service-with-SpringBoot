package com.sample.controller;

import com.sample.domain.UserDetail;
import com.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/user")
    public ResponseEntity<UserDetail> getUserDetail(
            @RequestParam(value = "userId", required = true) String userId)
    {

        UserDetail detail = userService.getUserDetail(userId);
        return new ResponseEntity(detail,
                HttpStatus.OK);
    }

}
