package com.lee.springbootdemo.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * star 指标分数表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcStarQuotaPoint implements Serializable {

    private static final long serialVersionUID = 1L;

    private String stqpId;

    /**
     * 评价主表外键
     */
    private String stevId;

    /**
     * 学会id
     */
    private Long orgId;

    /**
     * 指标表外键
     */
    private String stquId;

    /**
     * 分数
     */
    private Integer point;

    private Integer whDelete;

    private Long sort;

    private Integer level;

    private String mark;


}
