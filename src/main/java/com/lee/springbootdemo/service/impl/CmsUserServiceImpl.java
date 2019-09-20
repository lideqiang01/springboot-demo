package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.CmsUser;
import com.lee.springbootdemo.mapper.CmsUserMapper;
import com.lee.springbootdemo.service.CmsUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Service
public class CmsUserServiceImpl extends ServiceImpl<CmsUserMapper, CmsUser> implements CmsUserService {

}
