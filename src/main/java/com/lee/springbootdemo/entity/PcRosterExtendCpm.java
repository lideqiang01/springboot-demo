package com.lee.springbootdemo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2延长预备期党员名册
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcRosterExtendCpm implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String exteId;

    /**
     * 人员表外键
     */
    private Long emplId;

    /**
     * 办事机构党组织外键
     */
    private String cpowId;

    /**
     * 申请转正时间
     */
    private LocalDateTime applD;

    /**
     * 讨论入党时间
     */
    private LocalDateTime discussD;

    /**
     * 预备党员状态
     */
    private Integer status;

    /**
     * 讨论延长预备期的原因
     */
    private String reason;

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
     * 是否删除(0:未删除，1：已删除)
     */
    private Boolean wDelete;


}
