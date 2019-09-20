package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.OsProduct;
import com.lee.springbootdemo.mapper.OsProductMapper;
import com.lee.springbootdemo.service.OsProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Service
public class OsProductServiceImpl extends ServiceImpl<OsProductMapper, OsProduct> implements OsProductService {

}
