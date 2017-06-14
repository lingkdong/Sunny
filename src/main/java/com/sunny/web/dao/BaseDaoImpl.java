package com.sunny.web.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: lkdong
 * Date: 17-4-13
 * Time: 下午11:11
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class BaseDaoImpl<T, ID extends Serializable> extends GenericDAOImpl<T,ID> {
   @Autowired
   @Override
   public void setSessionFactory(SessionFactory sessionFactory){
       super.setSessionFactory(sessionFactory);
   }
}
