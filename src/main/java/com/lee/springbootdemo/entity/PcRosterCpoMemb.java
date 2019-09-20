package com.lee.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2党组织委员会成员名册
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcRosterCpoMemb implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String cpocId;

    /**
     * 人员表外键
     */
    private Long emplId;

    /**
     * 办事机构党组织外键
     */
    private String cpowId;

    /**
     * 党员表外键
     */
    private String cpmId;

    /**
     * 开始任职时间
     */
    private LocalDateTime startTime;

    /**
     * 结束任职时间
     */
    private LocalDateTime stopTime;

    /**
     * 0：现任;1：历任
     */
    private Integer status;

    /**
     * 排序
     */
    @TableId(value = "sort", type = IdType.AUTO)
    private Integer sort;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 标识
     */
    private String mark;

    /**
     * 是否删除
     */
    private Boolean wDelete;

    /**
     * 党内职务0.书记1.副书记2.委员
     */
    @TableField("reviewResult")
    private String reviewResult;

    /**
     * 学会id
     */
    private Long orgId;

    /**
     * 委员兼职
     */
    private String parttimejob;


}
