package com.lee.springbootdemo.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class StatisticalAllParent implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 数据表别名
     */
    private String alias;

    /**
     * 对应数据sql语句
     */
    private String sqlFrom;

    private Integer priority;

    /**
     * 数据字典标识用于页面判断类型所用
     */
    private String mark;

    /**
     * 层级
     */
    private Integer level;


}
