package com.lee.springbootdemo.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2 学会党委委员表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCponaCommittee implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String commId;

    /**
     * 所属学会id
     */
    private Long orgId;

    /**
     * 所属学会党委id
     */
    private String cponaId;

    /**
     * 党员id
     */
    private String cpmId;

    /**
     * 人员id
     */
    private Long emplId;

    /**
     * 状态（0.现任1.历任2.新任）
     */
    private Integer status;

    /**
     * 党组织关系所在地
     */
    private String location;

    /**
     * 技术职称
     */
    private String technical;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 标识
     */
    private String mark;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 是否删除(0.否1.是)
     */
    private Integer wDelete;


}
