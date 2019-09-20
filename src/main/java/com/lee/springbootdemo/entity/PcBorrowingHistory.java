package com.lee.springbootdemo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2_资料借阅历史
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcBorrowingHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 借阅历史id
     */
    private String histId;

    /**
     * 资料借阅id
     */
    private String borrId;

    /**
     * 党员表id
     */
    private String cpmId;

    /**
     * 借阅时间
     */
    private LocalDateTime createDate;

    /**
     * 归还时间
     */
    private LocalDateTime endDate;

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
     * 是否归还（0 未归还  1已归还 ）
     */
    private Integer status;


}
