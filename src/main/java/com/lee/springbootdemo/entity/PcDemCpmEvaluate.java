package com.lee.springbootdemo.entity;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2党员民主评测表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcDemCpmEvaluate implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String dcmeId;

    /**
     * 任务表外键
     */
    private String taskId;

    /**
     * 民主生活会任务表外键
     */
    private String dmtkId;

    /**
     * 党员评议状态
     */
    private Integer state;

    /**
     * 评价时间
     */
    private LocalDate evaluateD;

    /**
     * 党员表外键
     */
    private String cpmId;

    /**
     * 总评价值(0-优秀,1-合格,2-基本合格,3-不合格)
     */
    private Integer score;

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
