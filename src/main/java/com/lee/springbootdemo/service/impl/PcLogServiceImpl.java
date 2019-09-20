package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.PcLog;
import com.lee.springbootdemo.mapper.PcLogMapper;
import com.lee.springbootdemo.service.PcLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * v2项目日志表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Service
public class PcLogServiceImpl extends ServiceImpl<PcLogMapper, PcLog> implements PcLogService {

}
