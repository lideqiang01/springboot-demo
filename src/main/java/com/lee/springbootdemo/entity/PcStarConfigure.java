package com.lee.springbootdemo.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * star 星级配置表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcStarConfigure implements Serializable {

    private static final long serialVersionUID = 1L;

    private String stcfId;

    /**
     * 基础分
     */
    private Integer basePoint;

    /**
     * 基础分依据
     */
    private String baseBasis;

    /**
     * 每星的分值
     */
    private Integer starPoint;

    /**
     * 总加分
     */
    private Integer addPoint;

    /**
     * 总减分
     */
    private Integer subtractPoint;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 优秀党组织分值
     */
    private Integer excellent;

    /**
     * 良好党组织分值
     */
    private Integer good;

    private Long sort;

    private Integer whDelete;

    private Integer level;

    private String mark;


}
