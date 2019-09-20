package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.PcTask;
import com.lee.springbootdemo.mapper.PcTaskMapper;
import com.lee.springbootdemo.service.PcTaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * v2任务表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Service
public class PcTaskServiceImpl extends ServiceImpl<PcTaskMapper, PcTask> implements PcTaskService {

}
