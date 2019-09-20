package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.OsCategory;
import com.lee.springbootdemo.mapper.OsCategoryMapper;
import com.lee.springbootdemo.service.OsCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 分类表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Service
public class OsCategoryServiceImpl extends ServiceImpl<OsCategoryMapper, OsCategory> implements OsCategoryService {

}
