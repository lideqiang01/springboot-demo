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
 * 挂靠申请党组织表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcDepartPartyAttachApply implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 挂靠申请党组织ID
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
     * 书记预报人选
     */
    private String leaderName;

    /**
     * 副书记预报人选
     */
    private String viceLeaderName;

    /**
     * 委员人数
     */
    private String commiterCounter;

    /**
     * 委员后备人选
     */
    private String commiterReserveCounter;


}
