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
 * 申报管理历史表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcDeclarationFormHis implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 所属机构
     */
    private Long orgId;

    /**
     * 部门ID
     */
    private Long departId;

    /**
     * 机构层面类型（0：理事会层面  1：办事机构层面）
     */
    private Integer level;

    /**
     * 业务分类（0：党组织，1：党员队伍，2：负责人，3：职工队伍，4：学会业务，5：其他）
     */
    private String businessClassification;

    /**
     * 申报类型
     */
    private String applyType;

    /**
     * 申报时间
     */
    private LocalDate reportingTime;

    /**
     * 申报操作用户
     */
    private String reportingAccount;

    /**
     * 申报用户名
     */
    private String reportingName;

    /**
     * 审核状态
     */
    private Integer auditStatus;

    /**
     * 审核意见
     */
    private String auditComments;

    /**
     * 审核人员姓名
     */
    private String auditorName;

    /**
     * 审核人员账号
     */
    private String auditAccount;

    /**
     * 审核时间
     */
    private LocalDate auditTime;

    /**
     * 审批状态
     */
    private Integer approvalStatus;

    /**
     * 审批意见
     */
    private String approvalComments;

    /**
     * 审批人员姓名
     */
    private String approvalName;

    /**
     * 审批人员账号
     */
    private String approvalAccount;

    /**
     * 审批时间
     */
    private LocalDate approvalTime;

    /**
     * 批次Id
     */
    @TableField("batchId")
    private Long batchId;


}
