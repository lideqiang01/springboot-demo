package com.lee.springbootdemo.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2主题党日活动任务参加人员表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcTaskEventFrom implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String tefrId;

    /**
     * 任务表外键
     */
    private String taskId;

    /**
     * 学会id
     */
    private String orgId;

    /**
     * 党组织外键
     */
    private String cpoId;

    /**
     * 类型任务表外键(组织生活任务/民主评议任务)
     */
    private String evtkId;

    /**
     * 党员外键
     */
    private String cpmId;

    /**
     * 是否参加(0-未选择,1-参加,2-不参加)
     */
    private Integer attend;

    /**
     * 缺席原因
     */
    private String reason;

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
