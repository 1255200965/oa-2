package com.cetc38.mapper;

import com.cetc38.model.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}