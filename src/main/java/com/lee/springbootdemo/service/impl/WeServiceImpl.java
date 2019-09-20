package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.We;
import com.lee.springbootdemo.mapper.WeMapper;
import com.lee.springbootdemo.service.WeService;
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
public class WeServiceImpl extends ServiceImpl<WeMapper, We> implements WeService {

}
