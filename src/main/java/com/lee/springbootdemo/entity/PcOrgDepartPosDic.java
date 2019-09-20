package com.lee.springbootdemo.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 机构部门职位字典表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcOrgDepartPosDic implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;

    /**
     * 父id
     */
    private String parentid;

    /**
     * 名称
     */
    private String codename;

    /**
     * 类型（0：非党部门，1：党部门）
     */
    private Integer codetype;

    /**
     * 备注
     */
    private String comments;

    private Integer priority;

    /**
     * 层级
     */
    private Integer level;

    /**
     * 数据字典标识用于页面判断类型所用
     */
    private String mark;

    private Long code;


}
