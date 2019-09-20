package com.lee.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class StatisticalAllTable implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 所属统计分类
     */
    private Long classId;

    /**
     * 菜单分类Code
     */
    private Long menuNum;

    /**
     * 字段名称
     */
    private String name;

    /**
     * 精简名称
     */
    private String shortName;

    /**
     * 是否默认（0：默认1：非默认）
     */
    private Integer defult;

    /**
     * 是否启用
     */
    private Integer enable;

    /**
     * sql拼装select
     */
    private String sqlSelect;

    /**
     * SQL拼装参数
     */
    private String sqlWhere;

    /**
     * 是否存在子表多的一方数据
     */
    private Integer isChildTable;

    /**
     * 子表查询sql语句
     */
    private String childTableSql;

    /**
     * 下拉菜单赋值（json字符串格式）
     */
    private String dic;

    private Integer priority;

    /**
     * 数据字典标识用于页面判断类型所用
     */
    private String mark;

    /**
     * 层级
     */
    private Integer level;

    private String param;


}
