package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.PcEmployee;
import com.lee.springbootdemo.mapper.PcEmployeeMapper;
import com.lee.springbootdemo.service.PcEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工信息表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Service
public class PcEmployeeServiceImpl extends ServiceImpl<PcEmployeeMapper, PcEmployee> implements PcEmployeeService {

}
