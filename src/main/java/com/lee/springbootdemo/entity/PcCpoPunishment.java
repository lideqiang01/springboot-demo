package com.lee.springbootdemo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2党员奖惩
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCpoPunishment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String puniId;

    /**
     * 党员外键
     */
    private String cpmId;

    /**
     * 党小组外键
     */
    private Long cpgId;

    /**
     * 党组织外键
     */
    private String cpoId;

    /**
     * 违纪事实
     */
    private String disciplineFact;

    /**
     * 处置结果
     */
    private String handleResult;

    /**
     * 处置时间
     */
    private LocalDateTime handleD;

    /**
     * 整改情况
     */
    private String rectifySituation;

    /**
     * 整改联系人(人员表外键)
     */
    private Long linkmanEmp;

    /**
     * 状态（0优秀1不合格2违纪）
     */
    private Integer status;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 标识
     */
    private String mark;

    /**
     * 是否删除
     */
    private Boolean wDelete;

    /**
     * 学会id
     */
    private Long orgId;


}
