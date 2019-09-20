package com.lee.springbootdemo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v3 学习党的方针
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcStudyPartyPolicy implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ntspId;

    /**
     * 标题
     */
    private String title;

    /**
     * 学会id
     */
    private Long orgId;

    /**
     * 学会党委id
     */
    private String cponaId;

    /**
     * 开始时间
     */
    private LocalDateTime stD;

    /**
     * 结束时间
     */
    private LocalDateTime enD;

    /**
     * 宣讲计划状态(0-无,1-有)
     */
    private Integer preachPlan;

    /**
     * 宣讲队伍状态(0-无,1-有)--暂时弃用
     */
    private Integer preachTeam;

    /**
     * 宣讲活动状态(0-无,1-有)
     */
    private Integer preachEvent;

    /**
     * 宣讲总结状态(0-无,1-有)
     */
    private Integer preachSummary;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 宣讲总结内容
     */
    private String summary;

    /**
     * 宣讲总结报送时间
     */
    private LocalDateTime sumbitD;

    private Integer whDelete;

    private Long sort;

    private Integer level;

    private String mark;


}
