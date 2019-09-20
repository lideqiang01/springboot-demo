package com.lee.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 挂靠报备党组织表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcDepartPartyAttachReport implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 挂靠报备党组织ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 审核状态
     */
    private Integer status;

    /**
     * 审核意见
     */
    private String comments;

    /**
     * 上一次流程操作时间
     */
    private LocalDateTime operationTime;

    /**
     * 上一次流程操作者
     */
    private Long operator;

    /**
     * 是否是活动流程（0：结束，1：活跃）
     */
    private Integer applyKey;

    /**
     * 学会或机构id
     */
    private Long orgId;

    /**
     * 党组织全称
     */
    private String fullName;

    /**
     * 挂靠单位党组织同意的批件
     */
    private String partyApproveFile;

    /**
     * 请示文件
     */
    private String partyApplicationFile;


}
