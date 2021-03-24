package com.qy25.sm.service;

import com.qy25.sm.common.vo.PageVo;
import com.qy25.sm.entity.Brand;

public interface BrandService {
    PageVo<Brand> findPage();
}
