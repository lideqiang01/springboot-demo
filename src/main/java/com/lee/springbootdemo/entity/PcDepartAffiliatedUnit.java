package com.lee.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 党组织挂靠单位申报表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcDepartAffiliatedUnit implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     *  主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 部门表ID
     */
    private Long departId;

    /**
     * 挂靠党组织名称
     */
    private String affiliatedName;

    /**
     * 挂靠单位名称
     */
    private String affiliatedOrgName;

    /**
     * 挂靠党组织类型(0：申请(有委托)，1：报备(无委托))
     */
    private Integer affiliatedType;

    /**
     * 学会/机构ID
     */
    private Long orgId;


}
