package com.lee.springbootdemo.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * star 题目类型表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcStarSubjectType implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer ststId;

    /**
     * 题目类型名称
     */
    private String name;

    private Integer whDelete;

    private Long sort;

    private Integer level;

    private String mark;


}
