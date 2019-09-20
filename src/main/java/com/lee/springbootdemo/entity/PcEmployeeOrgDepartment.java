package com.lee.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 人员职位关联表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcEmployeeOrgDepartment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 员工id
     */
    private Long userId;

    /**
     * 部门id
     */
    private Long departId;

    /**
     * 职位信息
     */
    private Long majorId;

    /**
     * 学会及机构id
     */
    private Long orgId;

    /**
     * 类型(0：非党组织，1：党组织)
     */
    private Integer type;

    /**
     * 审核状态
     */
    private Integer status;

    /**
     * 审核意见
     */
    private String comments;

    /**
     * 本职工作
     */
    private Integer isPrimary;


}
