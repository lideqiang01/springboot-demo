package com.lee.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 党组织详细信息表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcDepartmentPartyInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 党组织类型
     */
    private Integer type;

    /**
     * 请示文件
     */
    private String file;

    /**
     * 专题会议纪要
     */
    private String subject;

    /**
     * 审核意见
     */
    private String comments;

    /**
     * 审核状态
     */
    private Integer status;

    /**
     * 所属部门
     */
    private Long departId;


}
