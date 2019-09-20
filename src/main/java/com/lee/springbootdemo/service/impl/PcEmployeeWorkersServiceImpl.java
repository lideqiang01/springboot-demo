package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.PcEmployeeWorkers;
import com.lee.springbootdemo.mapper.PcEmployeeWorkersMapper;
import com.lee.springbootdemo.service.PcEmployeeWorkersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 职工表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Service
public class PcEmployeeWorkersServiceImpl extends ServiceImpl<PcEmployeeWorkersMapper, PcEmployeeWorkers> implements PcEmployeeWorkersService {

}
