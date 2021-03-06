package com.lee.springbootdemo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2发展对象名册
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcRosterDevelopObj implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String deveId;

    /**
     * 人员表外键
     */
    private Long emplId;

    /**
     * 办事机构党组织外键
     */
    private String cpowId;

    /**
     * 是否经团组织推荐
     */
    private Integer isRecommend;

    /**
     * 党内联系人
     */
    private String contName;

    /**
     * 计划发展时间
     */
    private LocalDateTime planD;

    /**
     * 讨论入党时间
     */
    private LocalDateTime discussD;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 标识
     */
    private String mark;

    /**
     * 是否删除（0：未删除，1：已删除）
     */
    private Boolean wDelete;

    /**
     * 学会id
     */
    private Long orgId;


}
