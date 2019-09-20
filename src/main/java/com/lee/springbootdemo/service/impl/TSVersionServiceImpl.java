package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.TSVersion;
import com.lee.springbootdemo.mapper.TSVersionMapper;
import com.lee.springbootdemo.service.TSVersionService;
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
public class TSVersionServiceImpl extends ServiceImpl<TSVersionMapper, TSVersion> implements TSVersionService {

}
