package com.hzh.example.dao;

import com.hzh.example.po.User;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;

/**
 * Created by Zhanhao Wong on 2016/11/1.
 */
public interface UserRepository extends PagingAndSortingRepository<User, String>, QueryDslPredicateExecutor<User> {
    User findByUserName(String userName);
}
