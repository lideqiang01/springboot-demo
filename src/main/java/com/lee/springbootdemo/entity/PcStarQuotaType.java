package com.lee.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * star 指标类型表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcStarQuotaType implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "stqt_id", type = IdType.AUTO)
    private Integer stqtId;

    /**
     * 类型名称
     */
    private String name;

    private Integer whDelete;

    private Long sort;

    private Integer level;

    private String mark;


}
