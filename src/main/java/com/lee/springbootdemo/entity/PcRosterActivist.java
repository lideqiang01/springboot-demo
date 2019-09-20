package com.lee.springbootdemo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2入党积极分子名册
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcRosterActivist implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String actId;

    /**
     * 办事机构党组织外键
     */
    private String cpowId;

    /**
     * 人员表外键
     */
    private Long emplId;

    /**
     * 入党申请表外键
     */
    private String applId;

    /**
     * 党员id
     */
    private Long cpmId;

    /**
     * 成为入党积极分子时间
     */
    private LocalDateTime isActiviD;

    /**
     * 培养联系人
     */
    private String contName;

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

    private Long orgId;


}
