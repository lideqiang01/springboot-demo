package com.lee.springbootdemo.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * star 评价-指标中间表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcStarEvalSubject implements Serializable {

    private static final long serialVersionUID = 1L;

    private String stesId;

    /**
     * 评价主表外键
     */
    private String stevId;

    /**
     * 题目表外键
     */
    private String stsuId;

    private Integer whDelete;

    private Long sort;

    private String mark;

    private Integer level;


}
