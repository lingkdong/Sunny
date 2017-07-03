package com.sunny.web.dao;

import java.util.List;

/**
 * Created by DT254 on 2017/6/22.
 */
public interface BaseDao {
    <T> List<T> findBySql(Class<T> type, String sql, Object... values);
    <T> List<T> findBySql(Class<T> type, String sql);
}
