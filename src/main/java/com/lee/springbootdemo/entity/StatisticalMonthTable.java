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
 * 登录页面 ---月统计表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class StatisticalMonthTable implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 党组织总数
     */
    private Integer cpoCount;

    /**
     * 办事机构工作人员总数
     */
    private Integer boWorkerCount;

    /**
     * 党员总数
     */
    private Integer partyMemberCount;

    /**
     * 未建党组织总数
     */
    private Integer necpoCount;

    /**
     * 全国学会负责人总数
     */
    private Integer naLeaderCount;

    /**
     * 全国学会总数
     */
    private Integer naCount;

    /**
     * 党组织--学会党委总数
     */
    private Integer cponaCount;

    /**
     * 党组织--办事机构党组织总数
     */
    private Integer cpoboCount;

    /**
     * 党员---学会理事会总数
     */
    private Integer cpNacCount;

    /**
     * 党员---学会常务理事会总数
     */
    private Integer cpNascCount;

    /**
     * 党员---学会办事机构总数
     */
    private Integer cpBoCount;

    /**
     * 办事机构----理科
     */
    private Integer boScienceCount;

    /**
     * 办事机构---工科
     */
    private Integer boEngineeringCount;

    /**
     * 办事机构---农科
     */
    private Integer boAgricultureCount;

    /**
     * 办事机构---医科
     */
    private Integer boMedicalCount;

    /**
     * 办事机构---交叉学科
     */
    private Integer boInterdisciplinaryCount;

    /**
     * 未建党组织----学会党委
     */
    private Integer necpoOrgpocCount;

    /**
     * 全国学会---理科
     */
    private Integer orgScienceCount;

    /**
     * 全国学会---工科
     */
    private Integer orgEngineeringCount;

    /**
     * 全国学会---农科
     */
    private Integer orgAgricultureCount;

    /**
     * 全国学会---医科
     */
    private Integer orgMedicalCount;

    /**
     * 全国学会---交叉学科
     */
    private Integer orgInterdisciplinaryCount;

    /**
     * 全国学会负责人-理事长
     */
    private Integer orgDonaCount;

    /**
     * 全国学会负责人-副理事长
     */
    private Integer orgVdnaCount;

    /**
     * 全国学会负责人-秘书长
     */
    private Integer orgSecretaryCount;

    /**
     * 全国学会负责人-党员
     */
    @TableField("org_partyMember_count")
    private Integer orgPartymemberCount;

    /**
     * 查询日期
     */
    @TableField("searchDate")
    private String searchDate;


}
