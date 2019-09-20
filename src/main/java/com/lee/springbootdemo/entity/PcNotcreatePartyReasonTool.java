package com.lee.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 未建党组织原因工具表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcNotcreatePartyReasonTool implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 未建党组织原因
     */
    private String reason;

    /**
     * 标识（0：固定选项，1：手动填写）
     */
    private Integer mark;

    /**
     * 原因被选中次数
     */
    private Long optCount;

    /**
     * 预留状态字段
     */
    private Integer state;

    /**
     * 排序
     */
    private Long priority;


}
