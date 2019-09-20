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
 * 基层党组织党员管理(党员转接表)新建立
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcPartyTransfer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 基层党组织党员管理(党员转接表)新建立(自身Id)
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 入党时间
     */
    private LocalDateTime partyTime;

    /**
     * 转出党组织
     */
    private String rollOutCpo;

    /**
     * 党内职务
     */
    private String innerParty;

    /**
     * 转入党组织
     */
    private String intoCpo;

    /**
     * 上次缴纳党费时间
     */
    private LocalDateTime lastPartyMoneyTime;

    /**
     * 党费缴纳额(元/月)
     */
    private Float partyMoney;

    /**
     * 机构Id(orgId)
     */
    private Long orgId;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 申请时间
     */
    private LocalDateTime applyTime;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 审核审批意见
     */
    private String comments;


}
