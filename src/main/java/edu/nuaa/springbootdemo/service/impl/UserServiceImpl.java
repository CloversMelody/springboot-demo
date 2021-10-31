package edu.nuaa.springbootdemo.service.impl;

import edu.nuaa.springbootdemo.dao.UserInfoDao;
import edu.nuaa.springbootdemo.domain.UserInfo;
import edu.nuaa.springbootdemo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Description:
 * @author: wangli
 * @date: 2021/10/31 11:23
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserInfoDao userInfoDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int addUser(UserInfo userInfo) {
        return userInfoDao.insert(userInfo);
    }
}

