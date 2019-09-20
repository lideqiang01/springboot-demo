package com.lee.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 未建党组织原因数据表(pc_notcreate_party_reason_tool)索引
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcNotcreatePartyReasonData implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 未建党组织原因工具表外键ID
     */
    @TableField("tool_Id")
    private Long toolId;

    /**
     * 机构/学会外键ID
     */
    @TableField("org_Id")
    private Long orgId;

    /**
     * 状态
     */
    private Integer state;


}
