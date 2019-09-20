package com.lee.springbootdemo.entity;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2 项目申报回收站
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcRecycleProject implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 回收项目主键
     */
    private String reprId;

    /**
     * 操作人Id
     */
    private String userId;

    /**
     * 操作时间
     */
    private LocalDate createD;

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
     * 是否删除（0.未删除；1.已删除）
     */
    private Boolean wDelete;


}
