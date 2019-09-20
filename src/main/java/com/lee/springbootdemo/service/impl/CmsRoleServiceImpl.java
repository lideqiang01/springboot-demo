package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.CmsRole;
import com.lee.springbootdemo.mapper.CmsRoleMapper;
import com.lee.springbootdemo.service.CmsRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Service
public class CmsRoleServiceImpl extends ServiceImpl<CmsRoleMapper, CmsRole> implements CmsRoleService {

}
