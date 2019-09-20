package com.lee.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 党组织委员
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcEmployeePartyCommitteeMember implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 任职开始时间
     */
    private LocalDate startTime;

    /**
     * 任职结束时间
     */
    private LocalDate endTime;

    /**
     * 状态（0：现任，1：历任）
     */
    private Integer statue;

    /**
     * 人员信息表ID
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
     * 党内职务(字典表ID)
     */
    private String dicId;

    /**
     * 党员表ID
     */
    private Long memberId;

    /**
     * 是否删除
     */
    private Boolean isDelete;


}
