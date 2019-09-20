package com.lee.springbootdemo.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * star 评价接口表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcStarInterface implements Serializable {

    private static final long serialVersionUID = 1L;

    private String stinId;

    /**
     * 接口名
     */
    private String name;

    /**
     * 接口地址
     */
    private String address;

    /**
     * 接口描述
     */
    private String info;

    /**
     * 所属模块名称
     */
    private String module;

    /**
     * 上级模块
     */
    private String parentMo;

    private Long sort;

    private Integer whDelete;

    private String mark;

    private Integer level;


}
