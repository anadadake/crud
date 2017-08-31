package com.anadadake.crud.common.web.service;

import com.anadadake.crud.common.entity.UserEntity;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("UserService")
public class UserServiceImpl  extends BaseServiceImpl implements UserService {

//    @Override
    @Transactional
    public UserEntity getUserByUserNo(String userNo) {

        //TODO
        Criteria criteria = getSession().createCriteria(UserEntity.class);
        criteria.add(Restrictions.eq("userNo",userNo));
        //need to test hibernate的配置，需要实现session factory和config
        return (UserEntity)criteria.uniqueResult();
    }
//    @Override
    public List<UserEntity> getAllUsers() {
        return null;
    }

}
