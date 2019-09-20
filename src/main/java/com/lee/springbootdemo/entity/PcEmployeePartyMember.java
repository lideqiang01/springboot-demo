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
 * 党员信息表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcEmployeePartyMember implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 所属学会id
     */
    private Long orgId;

    /**
     * 部门id
     */
    private Long departmentId;

    /**
     * 人员基本信息表id
     */
    private Long employeeId;

    /**
     * 入党时间
     */
    private LocalDate partyTime;

    /**
     * 转正时间
     */
    private LocalDate positiveTime;

    /**
     * 所在党组织
     */
    private String partyOrganizationWhether;

    /**
     * 党组织关系是否在此(0:是，1：否)
     */
    private Integer whetherHere;

    /**
     * 党组织类型（0:党委，1:党总支，2:党支部）
     */
    private Integer partyType;

    /**
     * 党组织形式（0:独立党组织，1:高度重合党组织，2:联合党组织，3:临时党组织）
     */
    private Integer partyOrganization;

    /**
     * 党内职务(所在党组织)
     */
    private String innerParty;

    /**
     * 等级（冗余）
     */
    private String level;

    /**
     * 党组织关系所在地
     */
    @TableField("pcLocation")
    private String pcLocation;

    private Boolean isDelete;


}
