package com.lee.springbootdemo.entity;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2_调研结果表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcQuestionnaireResult implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String resuId;

    /**
     * 人员信息表id
     */
    private Long emplId;

    /**
     * 最终分数
     */
    private Integer finalScore;

    /**
     * 提交时间
     */
    private LocalDate createD;

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
