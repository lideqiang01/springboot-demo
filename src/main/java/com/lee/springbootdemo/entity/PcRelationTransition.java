package com.lee.springbootdemo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v3 党组织关系转接
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcRelationTransition implements Serializable {

    private static final long serialVersionUID = 1L;

    private String retrId;

    /**
     * 人员id
     */
    private Long emplId;

    /**
     * 学会id
     */
    private String orgId;

    /**
     * 原党组织id
     */
    private String cpoOld;

    /**
     * 新党组织id
     */
    private String cpoNew;

    /**
     * 申请时间
     */
    private LocalDateTime applyD;

    /**
     * 转接完成时间
     */
    private LocalDateTime transferD;

    /**
     * 状态
     */
    private Integer status;

    private Long sort;

    private Integer whDelete;

    private Integer level;

    private String mark;


}
