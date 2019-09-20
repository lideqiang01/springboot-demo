package com.lee.springbootdemo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2任务目标组(党组织id组)表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcTaskTargetGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String tktgId;

    /**
     * 党组织id组(字符串集)
     */
    private String cpoGroup;

    /**
     * 所属用户
     */
    private String userId;

    /**
     * 创建时间
     */
    private LocalDateTime createD;

    /**
     * 排序
     */
    private Long sort;

    /**
     * 标识
     */
    private String mark;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 是否删除
     */
    private Integer wDelete;


}
