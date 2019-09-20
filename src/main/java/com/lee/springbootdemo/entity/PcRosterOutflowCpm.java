package com.lee.springbootdemo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2流出党员名册
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcRosterOutflowCpm implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String outId;

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
     * 流出党员时间
     */
    private LocalDateTime outTime;

    /**
     * 所属机构外键
     */
    private Long orgId;

    /**
     * 所属学会党委外键
     */
    private String cponId;

    /**
     * 流出方向
     */
    private String outAddress;

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
     * 是否删除
     */
    private Boolean wDelete;


}
