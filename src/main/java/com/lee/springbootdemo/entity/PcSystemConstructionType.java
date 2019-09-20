package com.lee.springbootdemo.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v3 制度建设类型
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcSystemConstructionType implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer sctpId;

    /**
     * 类型名称
     */
    private String name;

    private Integer whDelete;

    private Long sort;

    private String mark;

    private Integer level;


}
