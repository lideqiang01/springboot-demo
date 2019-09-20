package com.lee.springbootdemo.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v3 党建强会开展活动表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcStrongOrgEvent implements Serializable {

    private static final long serialVersionUID = 1L;

    private String stoeId;

    /**
     * 学会党委id
     */
    private String cponaId;

    /**
     * 学会id
     */
    private Long orgId;

    /**
     * 党组织id
     */
    private String cpoId;

    /**
     * 领头人(党员id)
     */
    private String leaderP;

    /**
     * 党建强会主表外键
     */
    private String stogId;

    /**
     * 所属项目id
     */
    private String proId;

    /**
     * 状态
     */
    private Integer status;

    private Integer whDelete;

    private Long sort;

    private Integer level;

    private String mark;


}
