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
 * 职工表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcEmployeeWorkers implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 编制情况（0：在编:1：未编制）
     */
    private Integer organization;

    /**
     * 类型（0：其他，1：退休返聘，2：社会聘用）
     */
    private Integer type;

    /**
     * 人员基本信息表id
     */
    private Long employeeId;

    /**
     * 部门id
     */
    private Long departmentId;

    /**
     * 所属学会id
     */
    private Long orgId;

    /**
     * 专兼职情况（0：专职 ，1：兼职）
     */
    @TableField("pcLocatiton")
    private Integer pcLocatiton;

    private Boolean isDelete;


}
