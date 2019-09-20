package com.lee.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2思想政治工作回复表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCponaReportReply implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cprr_id", type = IdType.AUTO)
    private Integer cprrId;

    /**
     * 思想政治工作管理id
     */
    private String repoId;

    /**
     * 回复人员id
     */
    private Long emplId;

    /**
     * 回复日期
     */
    private LocalDate replyD;

    /**
     * 回复内容
     */
    private String content;

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


}
