package com.qy25.sm.service.base.impl;

import com.github.pagehelper.PageInfo;
import com.qy25.sm.common.vo.PageVo;
import com.qy25.sm.mapper.base.BaseMapper;
import com.qy25.sm.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
@Transactional
@Service
public class BaseServiceImpl<T> implements BaseService<T> {
    @Autowired
    private BaseMapper<T> baseMapper;
    @Override
    public PageVo<T> findPage() {
        List<T> list = baseMapper.selectByExample(null);
        PageVo<T> pageVo = getPageVo(list);
        return pageVo;
    }

    @Override
    public PageVo<T> findPage(T entity) {
        return null;
    }

    @Override
    public int insertEntity(T entity) {
        return baseMapper.insert(entity);
    }

    @Override
    public int updateEntity(T entity) {
        return baseMapper.updateByPrimaryKey(entity);
    }

    @Override
    public int deleteEntity(Serializable id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int batchInsertEntity(List<T> list) {
        list.forEach(item->{
            baseMapper.insert(item);
        });
        return 1;
    }

    @Override
    public int batchUpdateEntity(List<T> list) {
        list.forEach(item->{
            baseMapper.updateByPrimaryKey(item);
        });
        return 1;
    }

    @Override
    public int batchDeleteEntity(List<Serializable> ids) {
        ids.forEach(id->{
            baseMapper.deleteByPrimaryKey(id);
        });
        return 1;
    }

    @Override
    public PageVo<T> getPageVo(List<T> list) {
        PageInfo<T> pageInfo = new PageInfo<>(list);
        PageVo<T> pageVo = new PageVo<>();
        pageVo.setTotal(pageInfo.getTotal());
        pageVo.setList(list);
        return pageVo;
    }
}
