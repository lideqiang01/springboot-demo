package com.lee.springbootdemo.entity;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2民主生活会任务表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcDemTask implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String dmtkId;

    /**
     * 党组织外键
     */
    private String cpoId;

    /**
     * 任务表外键
     */
    private String taskId;

    /**
     * 确认码
     */
    private String confirmCode;

    /**
     * 任务状态
     */
    private Integer state;

    /**
     * 党员评议(0-未评议,1-评议中,2-已评议)
     */
    private Integer cpmEval;

    /**
     * 党支部评议(0-未评议,1-评议中,2-已评议)
     */
    private Integer cpoEval;

    /**
     * 工作情况书面报告(0-未上传,1-已上传)
     */
    private Integer report;

    /**
     * 对照检查材料(0-未上传1-已上传)
     */
    private Integer checkMaterial;

    /**
     * 党员评议完成时间
     */
    private LocalDate cpmEvalD;

    /**
     * 党支部评议完成时间
     */
    private LocalDate cpoEvalD;

    /**
     * 工作情况书面报告上传时间
     */
    private LocalDate reportD;

    /**
     * 对照检查材料上传时间
     */
    private LocalDate checkMaterialD;

    /**
     * 活动表id
     */
    private String eventId;

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
