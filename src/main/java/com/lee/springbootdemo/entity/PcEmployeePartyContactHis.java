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
 * 党建联系人历史表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcEmployeePartyContactHis implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 党内职务(字典表ID)
     */
    private String dicId;

    /**
     * 任职开始时间
     */
    private LocalDate startTime;

    /**
     * 任职结束时间
     */
    private LocalDate endTime;

    /**
     * 人员ID
     */
    private Long employeeId;

    /**
     * 所属学会ID
     */
    private Long orgId;

    /**
     * 状态（0：在任，1：历任）
     */
    private Integer statue;

    /**
     * 党员表Id
     */
    private Long memberId;

    @TableField("batchId")
    private Long batchId;

    private Integer declareHisId;


}
