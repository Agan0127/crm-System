package com.qy25.sm.controller;

import com.qy25.sm.common.http.AxiosResult;
import com.qy25.sm.common.vo.PageVo;
import com.qy25.sm.entity.Brand;
import com.qy25.sm.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("brand")
public class BrandController {
    @Autowired
    private BrandService brandService;
    @GetMapping("findPage")
    public AxiosResult findPage(){
        PageVo<Brand> page = brandService.findPage();
        return AxiosResult.success(page);
    }
}
