package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.OsOrderProduct;
import com.lee.springbootdemo.mapper.OsOrderProductMapper;
import com.lee.springbootdemo.service.OsOrderProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单明细表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Service
public class OsOrderProductServiceImpl extends ServiceImpl<OsOrderProductMapper, OsOrderProduct> implements OsOrderProductService {

}
