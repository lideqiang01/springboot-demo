package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.TSCategory;
import com.lee.springbootdemo.mapper.TSCategoryMapper;
import com.lee.springbootdemo.service.TSCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 分类管理 服务实现类
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Service
public class TSCategoryServiceImpl extends ServiceImpl<TSCategoryMapper, TSCategory> implements TSCategoryService {

}
