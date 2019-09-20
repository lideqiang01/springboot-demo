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
 * v2_工作总结分享评论表（弃用）
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCponaSummaryComment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "comm_id", type = IdType.AUTO)
    private Long commId;

    /**
     * 工作总结分享id
     */
    private Long summId;

    /**
     * 评论人员id
     */
    private Long emplId;

    /**
     * 评论内容
     */
    private String comment;

    /**
     * 父级回复id
     */
    private Long parentId;

    /**
     * 评论时间
     */
    private LocalDate commentD;

    /**
     * 回复时间
     */
    private LocalDate replyD;

    /**
     * 主键上级id
     */
    private Long lastCommId;

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
    private Integer wDelete;


}
