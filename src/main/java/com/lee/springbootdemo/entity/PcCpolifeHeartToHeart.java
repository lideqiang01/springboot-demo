package com.lee.springbootdemo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2谈心谈话表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCpolifeHeartToHeart implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String htohId;

    /**
     * 党组织外键
     */
    private String cpoId;

    /**
     * 学会id
     */
    private Long orgId;

    /**
     * 主题
     */
    private String title;

    /**
     * 开始时间
     */
    private LocalDateTime stD;

    /**
     * 结束时间
     */
    private LocalDateTime enD;

    /**
     * 创建时间
     */
    private LocalDateTime createD;

    /**
     * 约谈人（人员表外键）
     */
    private Long fromEmp;

    /**
     * 约谈内容
     */
    private String content;

    /**
     * 被约谈人（人员表外键)
     */
    private Long toEmp;

    /**
     * 约谈地点
     */
    private String addr;

    /**
     * 状态(0.计划中。1.执行中。2.已结束)
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
    private Boolean wDelete;


}
