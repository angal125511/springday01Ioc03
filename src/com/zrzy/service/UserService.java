package com.zrzy.service;

import com.zrzy.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: 徐大伟
 * User: ${和敬清寂}
 * Date: 2019/4/15
 * Time: 16:58
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("add----ServiceDao");
        userDao.add();
    }
}
