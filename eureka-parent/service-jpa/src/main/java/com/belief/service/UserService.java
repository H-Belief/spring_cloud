package com.belief.service;

import com.belief.entity.UserInfo;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {

    List<UserInfo> getUserList();
    UserInfo getUserByName(String name);
    UserInfo addUserInfo(UserInfo userInfo);
    UserInfo updateUserInfoById(UserInfo userInfo);
    void deleteUserInfoById(Long Id);
    List<UserInfo> getCurrentUserList();
    Page<UserInfo> getPageUserList();

}
