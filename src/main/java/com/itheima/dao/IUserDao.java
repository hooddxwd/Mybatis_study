package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

/**
 * @ Author     ：DX
 * @ Date       ：Created in 23:41 2020/5/7
 * @ Description：用户的持久层接口
 * @ Modified By：
 * @ Version:     $
 */
public interface IUserDao {

    //查询所有操作
    List<User> findAll();
}
