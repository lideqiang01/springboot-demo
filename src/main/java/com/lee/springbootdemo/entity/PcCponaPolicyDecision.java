package com.lee.springbootdemo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2三重一大
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCponaPolicyDecision implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String deciId;

    /**
     * 人员表id
     */
    private Long emplId;

    /**
     * 学会党委id
     */
    private String cponId;

    /**
     * 所属机构id
     */
    private Long orgId;

    /**
     * 党组织id
     */
    private String cpowId;

    /**
     * 标题
     */
    private String title;

    /**
     * 发布日期
     */
    private LocalDateTime createD;

    /**
     * 内容
     */
    private String content;

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
