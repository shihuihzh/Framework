package com.hzh.example.service;

import com.hzh.example.po.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * 测试service接口
 * Created by Zhanhao Wong on 2016/11/1.
 */
public interface IUserService {

    User addUser(User user);

    void deleteUser(String id);

    Page<User> findPageUser(Pageable pageable);

    User findByUserName(String userName);
}
