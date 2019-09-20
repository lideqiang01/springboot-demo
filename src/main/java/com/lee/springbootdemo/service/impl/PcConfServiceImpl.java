package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.PcConf;
import com.lee.springbootdemo.mapper.PcConfMapper;
import com.lee.springbootdemo.service.PcConfService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * v2会议信息表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Service
public class PcConfServiceImpl extends ServiceImpl<PcConfMapper, PcConf> implements PcConfService {

}
