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
 * 党组织负责人历史表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcEmployeePartyLeaderHis implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 部门类型(0：学会党组织:1：办事机构党组织)
     */
    private Integer sectorType;

    /**
     * 人员基本信息ID
     */
    private Long employeeId;

    /**
     * 部门ID
     */
    private Long departmentId;

    /**
     * 所属学会ID
     */
    private Long orgId;

    /**
     * 任职开始时间
     */
    private LocalDate startTime;

    /**
     * 任职结束时间
     */
    private LocalDate endTime;

    /**
     * 状态（0：在任，1：历任）
     */
    private Integer statue;

    /**
     * 批次Id
     */
    @TableField("batchId")
    private Long batchId;

    /**
     * 审核审批历史表ID
     */
    private Integer declareHisId;


}
