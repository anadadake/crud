package com.anadadake.crud.test;


import com.anadadake.crud.common.entity.UserEntity;
import com.anadadake.crud.common.web.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
        "classpath:spring-hibernate.xml" })
public class SpringMainTest {

    private static final Logger LOGGER = Logger.getLogger(SpringMainTest.class);

    @Autowired
    private UserService userService;


    @Test
    public void getUser() {

        String userNo = "000001";

        UserEntity user = userService.getUserByUserNo(userNo);

        LOGGER.info("--------------start:");
        if(user !=null){
            LOGGER.info(user.getUserNo());
            LOGGER.info(user.getEmail());
            LOGGER.info(user.getMobilePhone());
//            LOGGER.info(user.getUserInfo().getUserNameCn());
        }

        LOGGER.info("--------------end.");
        Assert.assertEquals(1,1);

//        LOGGER.info(JSON.toJSONString(id));
    }




}
