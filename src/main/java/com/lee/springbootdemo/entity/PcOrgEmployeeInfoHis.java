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
 * 学会职工队伍情况历史表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcOrgEmployeeInfoHis implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 理事会人数
     */
    private Integer commiterCounter;

    /**
     * 所属学会
     */
    private Long orgId;

    /**
     * 常务理事会人数
     */
    private Integer generalCommiterCounter;

    /**
     * 办事机构工作人员数
     */
    private Integer subOrgEmployeeCounter;

    /**
     * 办事机构离退休人员数
     */
    private Integer retiredCounter;

    /**
     * 办事机构专职工作人员数
     */
    private Integer occupiedCounter;

    /**
     * 有编制人员数
     */
    private Integer certificatedCounter;

    /**
     * 退休返聘人员数
     */
    private Integer reemployeeCounter;

    /**
     * 社会聘用人员数
     */
    private Integer contactedCounter;

    /**
     * 审核状态
     */
    private Integer status;

    /**
     * 审核意见
     */
    private String comments;

    /**
     * 字典表ID
     */
    private String dicId;

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
