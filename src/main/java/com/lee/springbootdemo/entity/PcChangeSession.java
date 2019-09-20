package com.lee.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcChangeSession implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 届次名称
     */
    private String sName;

    /**
     * 开始时间
     */
    private LocalDateTime stDate;

    /**
     * 结束时间
     */
    private LocalDateTime enDate;

    /**
     * 届次状态
     */
    private Integer sStatus;

    /**
     * 是否审核
     */
    private Integer sAudit;

    /**
     * 换届类型
     */
    private String sType;

    /**
     * 机构ID
     */
    private Long orgId;


}
