package com.first.firstDemo.mapper;

import com.first.firstDemo.model.User;
import com.first.firstDemo.model.UserExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * UserDAO继承基类
 */
@Mapper
@Repository
public interface UserDAO extends MyBatisBaseDao<User, Integer, UserExample> {
}