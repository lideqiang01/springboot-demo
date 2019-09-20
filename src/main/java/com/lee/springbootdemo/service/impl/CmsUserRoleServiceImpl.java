package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.CmsUserRole;
import com.lee.springbootdemo.mapper.CmsUserRoleMapper;
import com.lee.springbootdemo.service.CmsUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员角色关联表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Service
public class CmsUserRoleServiceImpl extends ServiceImpl<CmsUserRoleMapper, CmsUserRole> implements CmsUserRoleService {

}
