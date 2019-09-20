package com.lee.springbootdemo.entity;

import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 通知表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MsgOrgPartyNotice implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 发布时间
     */
    @TableField("releaseTime")
    private LocalDate releaseTime;

    /**
     * 创建人名称
     */
    @TableField("releaseName")
    private String releaseName;

    /**
     * 创建人ID
     */
    @TableField("releaseID")
    private String releaseID;

    /**
     * 创建时间
     */
    @TableField("createDate")
    private LocalDate createDate;

    /**
     * 发布人部门
     */
    @TableField("releaseDepartment")
    private String releaseDepartment;

    /**
     * 发布人部门ID
     */
    @TableField("releaseDepartmentID")
    private Long releaseDepartmentID;

    /**
     * 是否对外公开(0:对外1:对内)
     */
    @TableField("domesticOrForeign")
    private Integer domesticOrForeign;

    private Integer sort;

    private Integer wDelete;


}
