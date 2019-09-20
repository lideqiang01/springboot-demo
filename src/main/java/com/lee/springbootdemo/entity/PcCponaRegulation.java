package com.lee.springbootdemo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2_工作制度规定
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCponaRegulation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String reguId;

    /**
     * 标题
     */
    private String title;

    /**
     * 发布时间
     */
    private LocalDateTime createD;

    /**
     * 编制人员信息id
     */
    private Long emplId;

    /**
     * 内容
     */
    private String content;

    /**
     * 类型
     */
    private String type;

    /**
     * 版本号
     */
    private String versionNum;

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
     * 学会党委id
     */
    private String cponId;

    /**
     * 状态（采纳状态，0采纳通过，1采纳未通过，2待采纳）
     */
    private Integer status;

    /**
     * 图片路径
     */
    private String imagePath;

    /**
     * 所属机构id
     */
    private Long orgId;

    /**
     * 党组织id
     */
    private String cpowId;


}
