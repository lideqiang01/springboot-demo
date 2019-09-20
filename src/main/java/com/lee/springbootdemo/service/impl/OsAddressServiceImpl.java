package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.OsAddress;
import com.lee.springbootdemo.mapper.OsAddressMapper;
import com.lee.springbootdemo.service.OsAddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 收获地址表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Service
public class OsAddressServiceImpl extends ServiceImpl<OsAddressMapper, OsAddress> implements OsAddressService {

}
