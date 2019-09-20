package com.lee.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 学会业务情况历史表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcOrgMajorInfoHis implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 年收入（元）
     */
    private String annualIncome;

    /**
     * 所属学会
     */
    private Long orgId;

    /**
     * 净资产（元）
     */
    private String netIncome;

    /**
     * 主办期刊数量
     */
    private Integer articleCounter;

    /**
     * 设奖数量
     */
    private Integer honorCounter;

    /**
     * 个人会员数
     */
    private Integer memberCounter;

    /**
     * 单位会员数
     */
    private Integer orgCounter;

    /**
     * 成立时间
     */
    private LocalDate foundationTime;

    /**
     * 正常开展业务活动
     */
    private Integer isActive;

    /**
     * 审核状态
     */
    private Integer status;

    /**
     * 审核意见
     */
    private String comments;

    /**
     * 分支机构数量
     */
    @TableField("naNum")
    private Long naNum;

    /**
     * 上一年度未开展活动的分支机构数量(个)
     */
    @TableField("unaNum")
    private Long unaNum;

    /**
     * 是否正常换届
     */
    private Integer transition;

    /**
     * 是否按期召开理事会
     */
    private Integer convene;

    /**
     * 是否按期召开常务理事会
     */
    private Integer nasc;

    /**
     * 是否正常开展业务活动
     */
    private Integer nabiz;

    /**
     * 上一年度年检情况
     */
    private Integer renewal;

    /**
     * 批次Id
     */
    @TableField("batchId")
    private Long batchId;

    /**
     * 审核审批历史表ID
     */
    private Long declareHisId;


}
