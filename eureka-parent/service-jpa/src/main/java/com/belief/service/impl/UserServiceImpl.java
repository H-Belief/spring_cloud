package com.belief.service.impl;

import com.belief.entity.UserInfo;
import com.belief.respository.UserRepository;
import com.belief.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * 获取所有用户列表
     * @return
     */
    @Override
    public List<UserInfo> getUserList() {
        List<UserInfo> userList = new ArrayList<>();
        userList = userRepository.findAll();
        return userList;
    }

    /**
     * 通过姓名获取用户信息
     * @param name 用户姓名
     * @return
     */
    @Override
    public UserInfo getUserByName(String name) {
        return userRepository.findByName(name);
    }

    /**
     * 新增用户信息
     * @param userInfo 用户信息
     * @return
     */
    @Override
    public UserInfo addUserInfo(UserInfo userInfo) {
        return userRepository.save(userInfo);
    }

    /**
     * 更新用户信息
     * @param userInfo 用户信息
     * @return
     */
    @Override
    public UserInfo updateUserInfoById(UserInfo userInfo) {
        return userRepository.save(userInfo);
    }

    /**
     * 删除用户信息
     * @param id 主键ID
     */
    @Override
    public void deleteUserInfoById(Long id) {
        userRepository.deleteById(id);
    }

    /**
     * 获取最新的用户
     * @return
     */
    @Override
    public List<UserInfo> getCurrentUserList() {
        Sort sort = new Sort(Sort.Direction.DESC,"createTime");
        return userRepository.findAll(sort);
    }

    /**
     * 获取分页的用户
     * @return
     */
    @Override
    public Page<UserInfo> getPageUserList() {
        Sort sort = new Sort(Sort.Direction.DESC,"createTime");
        Pageable pageable = new PageRequest(0,5,sort);
        return userRepository.findAll(pageable);
    }
}
