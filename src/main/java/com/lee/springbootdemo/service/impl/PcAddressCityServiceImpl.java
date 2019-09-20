package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.PcAddressCity;
import com.lee.springbootdemo.mapper.PcAddressCityMapper;
import com.lee.springbootdemo.service.PcAddressCityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * v2城市表 [此表没有台湾香港澳门的数据] 服务实现类
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Service
public class PcAddressCityServiceImpl extends ServiceImpl<PcAddressCityMapper, PcAddressCity> implements PcAddressCityService {

}
