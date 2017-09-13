package com.anadadake.crud.common.web.service;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


/**
 * 用户认证
 */

public class UserAccessControllServiceImpl implements UserDetailsService {

    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        //TODO


        UserDetails details = null;

        try {
            // 用户名,密码,是否激活,accountnonexpired如果帐户没有过期设置为true
            // credentialsnonexpired如果证书没有过期设置为true
            // accountnonlocked如果帐户不锁定设置为true
//      com.aoyu.user.entity.User u = this.getUser(username);

            //目前是把角色给写死了
//      details = new org.springframework.security.core.userdetails.User(u.getUsername(), u.getPassword(),             u.isEnabled(),u.isAccountNonExpired(),u.isCredentialsNonExpired(),u.isAccountNonLocked(),AuthorityUtils.createAuthorityList("ROLE_USER"));
            details = new org.springframework.security.core.userdetails.User("kevin", "12345678", true, false, false, false, AuthorityUtils.createAuthorityList("ROLE_USER"));

        } catch (UsernameNotFoundException usernameNotFoundException) {
            usernameNotFoundException.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return details;


//        return detail;


//        return null;
    }
}
