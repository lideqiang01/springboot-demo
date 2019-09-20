package com.lee.springbootdemo.entity;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2党员示范岗表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCpoDemonstration implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String deonId;

    /**
     * 党员外键
     */
    private String cpmId;

    /**
     * 党组织外键
     */
    private String cpoId;

    /**
     * 党小组外键
     */
    private Long cpgId;

    /**
     * 岗位名称
     */
    private String name;

    /**
     * 岗位示范标准
     */
    private String standard;

    /**
     * 履职年度
     */
    private LocalDate performance;

    /**
     * 年度履职评价
     */
    private String estimate;

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
