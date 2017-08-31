package com.anadadake.crud.common.web.controller;

import com.anadadake.crud.common.entity.UserEntity;
import com.anadadake.crud.common.web.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    private static final Logger LOGGER = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/showInfo/{userNo}")
    public String showUserInfo(ModelMap modelMap, @PathVariable String userNo){
        LOGGER.info("查询用户：" + userNo);
        UserEntity user = userService.getUserByUserNo(userNo);
        modelMap.addAttribute("userNo", userNo);
        modelMap.addAttribute("userInfo", user);
        return "/user/showInfo";
    }
}
