package com.lee.springbootdemo.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2组织生活活动参加人员通用表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCpolifeEventFrom implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String evfrId;

    /**
     * 组织生活活动通用表外键
     */
    private String evenId;

    /**
     * 活动类型表外键
     */
    private Long edicId;

    /**
     * 人员表外键
     */
    private Long empId;

    /**
     * 状态(0-预计参加;1-预计缺席;2-已参加;3-未参加)
     */
    private Integer status;

    /**
     * 缺席原因
     */
    private String info;

    /**
     * 发言内容
     */
    private String speak;

    /**
     * 决议内容
     */
    private String decision;

    /**
     * 表决情况
     */
    private String vote;

    /**
     * 签到状态(0-未签到;1-已签到)
     */
    private Integer sign;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 标识
     */
    private String mark;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 是否删除
     */
    private Boolean wDelete;

    /**
     * 困难情况
     */
    private String difsituation;

    /**
     * 所需帮助
     */
    private String needhelp;


}
