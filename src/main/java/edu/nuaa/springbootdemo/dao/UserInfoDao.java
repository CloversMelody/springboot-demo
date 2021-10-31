package edu.nuaa.springbootdemo.dao;

import edu.nuaa.springbootdemo.domain.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @author: wangli
 * @date: 2021/10/31 10:18
 */
public interface UserInfoDao {

    int insert(UserInfo userInfo);
}
