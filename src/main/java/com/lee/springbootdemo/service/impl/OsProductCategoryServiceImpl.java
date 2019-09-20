package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.OsProductCategory;
import com.lee.springbootdemo.mapper.OsProductCategoryMapper;
import com.lee.springbootdemo.service.OsProductCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品分类关联表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Service
public class OsProductCategoryServiceImpl extends ServiceImpl<OsProductCategoryMapper, OsProductCategory> implements OsProductCategoryService {

}
