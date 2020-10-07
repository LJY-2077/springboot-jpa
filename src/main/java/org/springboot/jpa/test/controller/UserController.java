package org.springboot.jpa.test.controller;

import org.springboot.jpa.test.entity.UserEntity;
import org.springboot.jpa.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lijingyang
 * @Title:
 * @Package
 * @Description:
 * @date 2020/10/716:35
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/save" ,method = RequestMethod.POST)
    public UserEntity save(UserEntity userEntity) {
        UserEntity save = userService.save(userEntity);
        return save;
    }
}
