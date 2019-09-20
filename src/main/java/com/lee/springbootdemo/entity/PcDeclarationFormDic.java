package com.lee.springbootdemo.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 申报类型字典表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcDeclarationFormDic implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 关联父级ID
     */
    private String parentId;

    /**
     * 名称
     */
    private String name;

    /**
     * 申报类型指向的表单页面
     */
    private String formPath;

    /**
     * 路由地址
     */
    private String routePath;

    /**
     * 页面路径
     */
    private String path;

    /**
     * sqlMap名称
     */
    private String sqlmap;

    private Integer priority;

    /**
     * 层级
     */
    private Integer level;

    /**
     * 数据字典标识用于页面判断类型所用
     */
    private String mark;


}
