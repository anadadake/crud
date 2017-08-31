package com.anadadake.crud.common.web.service;

import com.anadadake.crud.common.entity.UserEntity;

import java.util.List;

public interface UserService {

    UserEntity getUserByUserNo(String userNo);
    List< UserEntity> getAllUsers();
}
