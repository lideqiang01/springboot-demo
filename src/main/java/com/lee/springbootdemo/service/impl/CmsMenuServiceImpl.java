package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.CmsMenu;
import com.lee.springbootdemo.mapper.CmsMenuMapper;
import com.lee.springbootdemo.service.CmsMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 目录表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Service
public class CmsMenuServiceImpl extends ServiceImpl<CmsMenuMapper, CmsMenu> implements CmsMenuService {

}
