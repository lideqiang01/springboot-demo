package com.lee.springbootdemo.entity;

import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 公告表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MsgOrgPartyInform implements Serializable {

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
     * 创建时间
     */
    @TableField("createDate")
    private LocalDate createDate;

    /**
     * 开始时间
     */
    private LocalDate startTime;

    /**
     * 结束时间
     */
    private LocalDate endTime;

    /**
     * 发布人名称
     */
    @TableField("releaseName")
    private String releaseName;

    /**
     * 发布人ID
     */
    @TableField("releaseID")
    private String releaseID;

    /**
     * 发布部门ID
     */
    @TableField("releaseDepartment")
    private String releaseDepartment;

    /**
     * 发布部门ID
     */
    @TableField("releaseDepartmentId")
    private Long releaseDepartmentId;

    /**
     * 是否已读 0：未读，1：已读
     */
    private Integer isRead;

    private Integer sort;

    private Long wDelete;


}
