package com.qy25.sm.service.base;

import com.qy25.sm.common.vo.PageVo;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T> {
    //分页查询
    PageVo<T> findPage();
    //有条件的分页查询
    PageVo<T> findPage(T entity);
    //添加对象
    int insertEntity(T entity);
    //修改对象
    int updateEntity(T entity);
    //删除对象
    int deleteEntity(Serializable id);
    //批量添加对象
    int batchInsertEntity(List<T> list);
    //批量修改对象
    int batchUpdateEntity(List<T> list);
    //批量删除对象
    int batchDeleteEntity(List<Serializable> ids);

    PageVo<T> getPageVo(List<T> list);
}
