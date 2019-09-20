package com.lee.springbootdemo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v3  发展党员各阶段信息表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcRecruitCpmInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String repiId;

    /**
     * 发展党员状态字典表外键
     */
    private Long repsId;

    /**
     * 内容
     */
    private String content;

    /**
     * 发展党员主表外键
     */
    private String repmId;

    /**
     * 操作时间
     */
    private LocalDateTime operateD;

    /**
     * 操作人
     */
    private Long operateP;

    private Long sort;

    private Integer whDelete;

    private Integer level;

    private String mark;


}
