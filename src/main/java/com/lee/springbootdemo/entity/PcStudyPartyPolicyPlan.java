package com.lee.springbootdemo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v3 学习党的方针-宣讲计划
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcStudyPartyPolicyPlan implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ntplId;

    /**
     * 学习党的方针表外键
     */
    private String ntspId;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 创建时间
     */
    private LocalDateTime createD;

    /**
     * 创建人(用户id)
     */
    private String createP;

    private Long sort;

    private Integer whDelete;

    private Integer level;

    private String mark;


}
