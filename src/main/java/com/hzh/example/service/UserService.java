package com.hzh.example.service;

import com.hzh.example.dao.UserRepository;
import com.hzh.example.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * 测试sevice
 * Created by Zhanhao Wong on 2016/11/1.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public User addUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public void deleteUser(String id) {
        this.userRepository.delete(id);
    }

    @Override
    public Page<User> findPageUser(Pageable pageable) {
        return this.userRepository.findAll(pageable);
    }

    @Override
    public User findByUserName(String userName) {
        return this.userRepository.findByUserName(userName);
    }
}
