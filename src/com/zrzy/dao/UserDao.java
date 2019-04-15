package com.zrzy.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: 徐大伟
 * User: ${和敬清寂}
 * Date: 2019/4/15
 * Time: 16:58
 */
@Repository("userDao")
public class UserDao {

    public void add(){
        System.out.println("add----UserDao");
    }
}
