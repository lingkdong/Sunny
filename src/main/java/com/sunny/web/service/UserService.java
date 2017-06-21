package com.sunny.web.service;

import com.sunny.web.model.User;

/**
 * Created by DT254 on 2017/4/13.
 */
public interface UserService {
    User findUserByName(String username);

    User findUserByEmail(String email);


}
