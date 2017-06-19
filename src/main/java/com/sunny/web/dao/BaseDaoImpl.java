package com.sunny.web.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: lkdong
 * Date: 17-4-13
 * Time: 下午11:11
 * To change this template use File | Settings | File Templates.
 */
@Repository
@Transactional
public class BaseDaoImpl<T, ID extends Serializable> extends GenericDAOImpl<T,ID> {
    @Resource
    @Override
    public void setSessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }
}
