package org.springboot.jpa.admin.controller;

import org.springboot.jpa.admin.entity.User;
import org.springboot.jpa.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public User save(User userEntity) {
        User save = userService.save(userEntity);
        return save;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Page<User> list(User userEntity) {
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        Pageable pageable = PageRequest.of(0,20,sort);
        Page<User> all = userService.findAll(pageable);
        return all;
    }
}
