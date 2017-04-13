package com.sunny.web.dao;

import com.sunny.web.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by DT254 on 2017/4/13.
 */
public interface UserDao {
    User getUserByName(String username);
}
