package com.lee.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 学会党员队伍情况历史表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcOrgPartyMemberInfoHis implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 理事中党员人数
     */
    private Integer commiterPmCounter;

    /**
     * 所属学会
     */
    private Long orgId;

    /**
     * 常务理事中党员人数
     */
    private Integer generalCommiterPmCounter;

    /**
     * 办事机构工作人员中党员人数
     */
    private Integer subOrgPmCounter;

    /**
     * 办事机构专职工作人员中党员人数
     */
    private Integer occupiedPmCounter;

    /**
     * 在编党员数
     */
    private Integer employeePmCounter;

    /**
     * 退休返聘党员数
     */
    private Integer reemployeePmCounter;

    /**
     * 社会聘用党员数
     */
    private Integer contactedPmCounter;

    /**
     * 审核状态
     */
    private Integer status;

    /**
     * 审核意见
     */
    private String comments;

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
