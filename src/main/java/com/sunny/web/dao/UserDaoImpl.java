package com.sunny.web.dao;

import com.sunny.web.model.User;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by DT254 on 2017/4/13.
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl implements UserDao {
    public User getUserByName(String username) {
        StringBuilder sql = new StringBuilder();
        sql.append("select * from user");
        List<User> list= findBySql(User.class,sql.toString());
        if(list!=null && list.size()>0){
            return list.get(0);
        }
        return null;
    }
}
