package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.OsOrder;
import com.lee.springbootdemo.mapper.OsOrderMapper;
import com.lee.springbootdemo.service.OsOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Service
public class OsOrderServiceImpl extends ServiceImpl<OsOrderMapper, OsOrder> implements OsOrderService {

}
