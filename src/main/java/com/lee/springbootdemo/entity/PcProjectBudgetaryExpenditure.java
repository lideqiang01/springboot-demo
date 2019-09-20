package com.lee.springbootdemo.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2项目经费预算支出表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcProjectBudgetaryExpenditure implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String prbuId;

    /**
     * 基本信息表id
     */
    private String proId;

    /**
     * 支出内容
     */
    private String expenditureContent;

    /**
     * 金额
     */
    private Double money;

    /**
     * 备注
     */
    private String remarks;

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
