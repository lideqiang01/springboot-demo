package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.PcInformation;
import com.lee.springbootdemo.mapper.PcInformationMapper;
import com.lee.springbootdemo.service.PcInformationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * v2消息表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Service
public class PcInformationServiceImpl extends ServiceImpl<PcInformationMapper, PcInformation> implements PcInformationService {

}
