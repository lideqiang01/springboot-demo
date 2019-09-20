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
 * 党员组织关系转接表（pc_emp_party_transfer）
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcEmpPartyTransfer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
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

    private LocalDateTime operationTime;

    private Long operator;

    private Integer applyKey;

    /**
     * 用户编码
     */
    private Long employeeId;

    /**
     * 学会聘用合同
     */
    private String contractFile;

    /**
     * 补充协议副本
     */
    private String contractAttach;

    /**
     * 组织关系转接请示文件
     */
    private String contractApplication;

    /**
     * 介绍信
     */
    private String partyIntroduction;

    /**
     * 学会聘用合同
     */
    private String contractFileName;

    /**
     * 补充协议副本
     */
    private String contractAttachName;

    /**
     * 组织关系转接请示文件
     */
    private String contractApplicationName;

    /**
     * 介绍信
     */
    private String partyIntroductionName;


}
