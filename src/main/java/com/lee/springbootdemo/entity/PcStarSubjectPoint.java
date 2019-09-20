package com.lee.springbootdemo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * star 题目分数表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcStarSubjectPoint implements Serializable {

    private static final long serialVersionUID = 1L;

    private String stspId;

    /**
     * 学会id
     */
    private Long orgId;

    /**
     * 题目表外键
     */
    private String stsuId;

    /**
     * 评价主表外键
     */
    private String stevId;

    /**
     * 回答内容
     */
    private String answer;

    /**
     * 分数
     */
    private Integer point;

    /**
     * 评审人
     */
    private String userId;

    /**
     * 评审时间
     */
    private LocalDateTime evalD;

    private Integer whDelete;

    private Long sort;

    private Integer level;

    private String mark;


}
