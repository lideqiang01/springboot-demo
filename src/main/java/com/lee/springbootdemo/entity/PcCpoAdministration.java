package com.lee.springbootdemo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2党组织管理
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCpoAdministration implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String cpoId;

    /**
     * 党员表id
     */
    private String cpmId;

    /**
     * 委员表id
     */
    private Long pocId;

    /**
     * 党组织名称
     */
    private String cpoName;

    /**
     * 挂靠状态，0有挂靠，1无挂靠
     */
    private Integer anchoredStatus;

    /**
     * 党组织地址
     */
    private String cpoAddress;

    /**
     * 批复日期
     */
    private LocalDateTime replyD;

    /**
     * 党组织形式
     */
    private Integer cpoDic;

    /**
     * 党组织类型，0党委，1党总支，2党支部
     */
    private Integer cpoType;

    /**
     * 党组织图标
     */
    private String cpoLogUrl;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 是否删除
     */
    private Integer wDelete;

    /**
     * 标识
     */
    private String mark;


}
