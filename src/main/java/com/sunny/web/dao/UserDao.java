package com.sunny.web.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAO;
import com.sunny.web.model.User;

/**
 * Created by DT254 on 2017/4/13.
 */
public interface UserDao extends GenericDAO<User,Long> {
    User findUserByName(String username);
    User findUserByEmail(String email);
}
