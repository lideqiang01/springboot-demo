package com.lee.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 党组织生活内容
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CmsOrgPartyLifeContent implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章作者
     */
    private String author;

    /**
     * 文章发布者
     */
    private String submitter;

    /**
     * 文章创建/发布时间
     */
    private LocalDateTime createTime;

    /**
     * 浏览权限
     */
    private Integer browseLevel;

    /**
     * 党组织生活文章栏目/主题表外键ID
     */
    private Long channelId;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 学会ID
     */
    private Long orgId;

    /**
     * 部门ID
     */
    private Long deptId;

    /**
     * 审核状态(0：未审核，1：已审核，2：未通过)
     */
    private Integer state;

    /**
     * 内容
     */
    private String content;

    /**
     * 查看数
     */
    @TableField("viewNumber")
    private Integer viewNumber;

    /**
     * 点赞数
     */
    @TableField("pointNumber")
    private Integer pointNumber;

    /**
     * 摘要
     */
    private String summary;

    /**
     * 审核人姓名
     */
    private String modifier;

    /**
     * 审核人ID
     */
    @TableField("modifierId")
    private String modifierId;

    /**
     * 审核日期
     */
    @TableField("modifierDate")
    private LocalDate modifierDate;

    /**
     * 审批人
     */
    private String approval;

    /**
     * 审批ID
     */
    @TableField("approvalId")
    private String approvalId;

    /**
     * 审批时间
     */
    @TableField("approvalDate")
    private LocalDate approvalDate;


}
