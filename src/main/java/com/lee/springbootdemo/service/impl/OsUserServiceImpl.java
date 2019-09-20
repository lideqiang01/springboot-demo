package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.OsUser;
import com.lee.springbootdemo.mapper.OsUserMapper;
import com.lee.springbootdemo.service.OsUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Service
public class OsUserServiceImpl extends ServiceImpl<OsUserMapper, OsUser> implements OsUserService {

}
