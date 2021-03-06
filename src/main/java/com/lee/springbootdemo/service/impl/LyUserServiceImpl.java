package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.LyUser;
import com.lee.springbootdemo.mapper.LyUserMapper;
import com.lee.springbootdemo.service.LyUserService;
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
public class LyUserServiceImpl extends ServiceImpl<LyUserMapper, LyUser> implements LyUserService {

}
