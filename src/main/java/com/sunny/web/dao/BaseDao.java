package com.sunny.web.dao;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lkdong
 * Date: 17-4-13
 * Time: 下午11:03
 * To change this template use File | Settings | File Templates.
 */
public interface BaseDao {
    <T> List<T> findBySql(Class<T> type, String sql, Object... values);
}
