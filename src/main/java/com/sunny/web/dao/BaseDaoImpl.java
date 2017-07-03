package com.sunny.web.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lkdong
 * Date: 17-4-13
 * Time: 下午11:11
 * To change this template use File | Settings | File Templates.
 */
@Repository
@Transactional
public class BaseDaoImpl<T, ID extends Serializable> extends GenericDAOImpl<T,ID>  implements BaseDao{
    @Resource
    @Override
    public void setSessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    public <T> List<T> findBySql(Class<T> type, String sql, Object... values) {
        SQLQuery query = this.getSession().createSQLQuery(sql);
        query.addEntity(type);
        if ((values != null) && (values.length != 0)) {
            for (int i = 0; i < values.length; i++) {
                query.setParameter(i, values[i]);
            }
        }
        return query.list();
    }
    public <T> List<T> findBySql(Class<T> type, String sql) {
        return findBySql(type,sql,null);
    }
}
