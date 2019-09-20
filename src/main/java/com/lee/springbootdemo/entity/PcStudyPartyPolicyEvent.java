package com.lee.springbootdemo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v3 学习党的方针-宣讲活动
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcStudyPartyPolicyEvent implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ntevId;

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
     * 开始时间
     */
    private LocalDateTime stD;

    /**
     * 结束时间
     */
    private LocalDateTime enD;

    /**
     * 状态
     */
    private Integer status;

    private Integer whDelete;

    private Long sort;

    private Integer level;

    private String mark;


}
