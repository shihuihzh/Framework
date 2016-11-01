package com.hzh.example.controller;

import com.hzh.example.config.ExampleProp;
import com.hzh.example.po.User;
import com.hzh.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.data.querydsl.QSort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static com.sun.tools.doclint.Entity.prop;

/**
 * Created by Zhanhao Wong on 2016/10/30.
 */

@Controller
@RequestMapping("/example/user")
public class ExampleUserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/add")
    @ResponseBody
    public User add() {
        User user = new User();
        user.setUserName("hzh" + Math.floor(Math.random() * 100));
        user.setPassword("pass" + Math.floor(Math.random() * 100));
        return this.userService.addUser(user);
    }

    @RequestMapping("/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable("id") String id) {
       this.userService.deleteUser(id);
        return "success";
    }

    @RequestMapping("/findByUserName")
    @ResponseBody
    public User findByUserName(String userName) {
        return this.userService.findByUserName(userName);

    }

    @RequestMapping("/find")
    @ResponseBody
    public Object find(int page, int size) {
        return this.userService.findPageUser(new QPageRequest(page, size, new QSort()));
    }

}
