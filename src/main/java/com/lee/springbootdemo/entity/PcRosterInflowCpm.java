package com.lee.springbootdemo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2流入党员名册
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcRosterInflowCpm implements Serializable {

    private static final long serialVersionUID = 1L;

    private String inflId;

    /**
     * 人员表外键
     */
    private Long emplId;

    /**
     * 办事机构党组织外键
     */
    private String cpowId;

    /**
     * 党员表外键
     */
    private String membId;

    /**
     * 流入时间
     */
    private LocalDateTime inTime;

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
     * 是否删除(0:未删除，1:已删除)
     */
    private Boolean wDelete;


}
