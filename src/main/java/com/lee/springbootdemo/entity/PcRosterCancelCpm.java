package com.lee.springbootdemo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2取消预备党员资格名册
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcRosterCancelCpm implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String canlId;

    /**
     * 人员表外键
     */
    private Long emplId;

    /**
     * 申请转正时间
     */
    private String applD;

    /**
     * 讨论入党时间
     */
    private LocalDateTime discussD;

    /**
     * 预备党员状态
     */
    private Integer status;

    /**
     * 延长预备原因
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
     * 是否删除（0:未删除，1:已删除）
     */
    private Boolean wDelete;

    /**
     * 办事机构党组织外键
     */
    private Long cpowId;


}
