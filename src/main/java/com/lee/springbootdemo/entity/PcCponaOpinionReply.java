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
 * v2_意见与建议汇总回复表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCponaOpinionReply implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "repl_id", type = IdType.AUTO)
    private Long replId;

    /**
     * 意见与建议汇总提出id
     */
    private String opinId;

    /**
     * 上级id
     */
    private Long lastReplId;

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
