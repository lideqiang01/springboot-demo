package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.TSDemo;
import com.lee.springbootdemo.mapper.TSDemoMapper;
import com.lee.springbootdemo.service.TSDemoService;
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
public class TSDemoServiceImpl extends ServiceImpl<TSDemoMapper, TSDemo> implements TSDemoService {

}
