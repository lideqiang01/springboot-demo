package com.lee.springbootdemo.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2 项目信息临时表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcProjectTemporary implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学会表id
     */
    private Long orgId;

    /**
     * 党组织id
     */
    private String cpoId;

    /**
     * 暂存信息json字符串
     */
    private String tempInfo;

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
