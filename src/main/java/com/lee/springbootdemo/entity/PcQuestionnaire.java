package com.lee.springbootdemo.entity;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2_工作调研（调查问卷）
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcQuestionnaire implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String quesId;

    /**
     * 标题
     */
    private String title;

    /**
     * 人员信息表id
     */
    private Long emplId;

    /**
     * 发布日期
     */
    private LocalDate createD;

    /**
     * 点击数
     */
    private Integer clickNum;

    /**
     * 发布范围
     */
    private String releaseScope;

    /**
     * 截止日期
     */
    private LocalDate endD;

    /**
     * 状态
     */
    private Integer status;

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
