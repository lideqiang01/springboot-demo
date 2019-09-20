package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.TSLog;
import com.lee.springbootdemo.mapper.TSLogMapper;
import com.lee.springbootdemo.service.TSLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Service
public class TSLogServiceImpl extends ServiceImpl<TSLogMapper, TSLog> implements TSLogService {

}
