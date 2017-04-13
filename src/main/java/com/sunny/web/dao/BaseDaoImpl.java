package com.sunny.web.dao;

import org.hibernate.SQLQuery;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lkdong
 * Date: 17-4-13
 * Time: 下午11:11
 * To change this template use File | Settings | File Templates.
 */
public class BaseDaoImpl extends HibernateDaoSupport implements BaseDao {
    @Override
    public <T> List<T> findBySql(Class<T> type, String sql, Object... values) {
        SQLQuery query = getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(sql);
        query.addEntity(type);
        if ((values != null) && (values.length != 0)) {
            for (int i = 0; i < values.length; i++) {
                query.setParameter(i, values[i]);
            }
        }
        return query.list();
    }
}
