package com.lee.springbootdemo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2 展风采，树楷模
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCponaNominate implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String nomiId;

    /**
     * 被推荐人姓名
     */
    private String name;

    /**
     * 所属机构id
     */
    private Integer orgId;

    /**
     * 内容
     */
    private String content;

    /**
     * 创建时间
     */
    private LocalDateTime createD;

    /**
     * 状态（0:未提交1:已提交(待审核)2:通过3:退回4:发布）
     */
    private Integer status;

    /**
     * 提交时间
     */
    private LocalDateTime subD;

    /**
     * 未通过原因
     */
    private String reason;

    /**
     * 党组织id
     */
    private String cpowId;

    /**
     * 学会党委id
     */
    private String cponId;

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

    /**
     * 图片路径
     */
    private String imagePath;

    /**
     * 删除人姓名
     */
    private String deleteName;

    /**
     * 删除时间
     */
    private LocalDateTime deleteD;


}
