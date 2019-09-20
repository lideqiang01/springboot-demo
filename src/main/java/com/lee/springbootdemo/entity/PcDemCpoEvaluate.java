package com.lee.springbootdemo.entity;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2党支部(班子)民主评测表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcDemCpoEvaluate implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String dcoeId;

    /**
     * 任务表外键
     */
    private String taskId;

    /**
     * 民主生活会任务表外键
     */
    private String dmtkId;

    /**
     * 建议
     */
    private String proposal;

    /**
     * 党员外键
     */
    private String cpmId;

    /**
     * 评价时间
     */
    private LocalDate evaluateD;

    /**
     * 总评价值
     */
    private Integer score;

    /**
     * 工作单位
     */
    private String company;

    /**
     * 排序
     */
    private Integer sort;

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
