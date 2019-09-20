package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.OsOrderStatus;
import com.lee.springbootdemo.mapper.OsOrderStatusMapper;
import com.lee.springbootdemo.service.OsOrderStatusService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单状态表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Service
public class OsOrderStatusServiceImpl extends ServiceImpl<OsOrderStatusMapper, OsOrderStatus> implements OsOrderStatusService {

}
