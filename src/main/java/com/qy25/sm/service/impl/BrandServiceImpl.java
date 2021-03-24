package com.qy25.sm.service.impl;

import com.github.pagehelper.PageInfo;
import com.qy25.sm.common.vo.PageVo;
import com.qy25.sm.entity.Brand;
import com.qy25.sm.mapper.BrandMapper;
import com.qy25.sm.service.BrandService;
import com.qy25.sm.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BrandServiceImpl extends BaseServiceImpl<Brand> implements BrandService {

}
