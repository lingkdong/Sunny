package com.sunny.web.dao;

import com.googlecode.genericdao.search.Search;
import com.sunny.web.model.User;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by DT254 on 2017/4/13.
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User,Long> implements UserDao {

    @Override
    public User findUserByName(String username) {
        return searchUnique(new Search().addFilterEqual("username",username));
    }

    @Override
    public User findUserByEmail(String email) {
        return searchUnique(new Search().addFilterEqual("email",email));
    }
}
