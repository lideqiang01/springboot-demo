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
 * 
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class StatisticalOrgTable implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * （理科）学会数
     */
    @TableField("potaCount")
    private Integer potaCount;

    /**
     * （工科）学会数
     */
    @TableField("potbCount")
    private Integer potbCount;

    /**
     * （农科）学会数
     */
    @TableField("potcCount")
    private Integer potcCount;

    /**
     * （医科）学会数
     */
    @TableField("potdCount")
    private Integer potdCount;

    /**
     * （交叉学科）学会数
     */
    @TableField("poteCount")
    private Integer poteCount;

    /**
     * （无）业务主管 学会数
     */
    @TableField("affUnitsfzCount")
    private Integer affUnitsfzCount;

    /**
     * （中国科协）业务主管 学会数
     */
    @TableField("affUnitsfaCount")
    private Integer affUnitsfaCount;

    /**
     * （中国科学院）业务主管 学会数
     */
    @TableField("affUnitsfbCount")
    private Integer affUnitsfbCount;

    /**
     * （国资委）业务主管 学会数
     */
    @TableField("affUnitsfcCount")
    private Integer affUnitsfcCount;

    /**
     * （民政部）业务主管 学会数
     */
    @TableField("affUnitsfdCount")
    private Integer affUnitsfdCount;

    /**
     * （教育部）业务主管 学会数
     */
    @TableField("affUnitsfeCount")
    private Integer affUnitsfeCount;

    /**
     * （农业部）业务主管 学会数
     */
    @TableField("affUnitsffCount")
    private Integer affUnitsffCount;

    /**
     * （科技部）业务主管 学会数
     */
    @TableField("affUnitsfgCount")
    private Integer affUnitsfgCount;

    /**
     * （国家海洋局）业务主管 学会数
     */
    @TableField("affUnitsfhCount")
    private Integer affUnitsfhCount;

    /**
     * （国防科工局）业务主管 学会数
     */
    @TableField("affUnitsfiCount")
    private Integer affUnitsfiCount;

    /**
     * （国家质检总局）业务主管 学会数
     */
    @TableField("affUnitsfjCount")
    private Integer affUnitsfjCount;

    /**
     * （国家知识产权局）业务主管 学会数
     */
    @TableField("affUnitsfkCount")
    private Integer affUnitsfkCount;

    /**
     * （国家卫生计生委）业务主管 学会数
     */
    @TableField("affUnitsflCount")
    private Integer affUnitsflCount;

    /**
     * （国家新闻出版广电总局）业务主管 学会数
     */
    @TableField("affUnitsfmCount")
    private Integer affUnitsfmCount;

    /**
     * （国家安全生产监督管理总局）业务主管 学会数
     */
    @TableField("affUnitsfnCount")
    private Integer affUnitsfnCount;

    @TableField("affUnitsfoCount")
    private Integer affUnitsfoCount;

    @TableField("affUnitsfpCount")
    private Integer affUnitsfpCount;

    @TableField("affUnitsfqCount")
    private Integer affUnitsfqCount;

    /**
     * （无）挂靠类型 学会数
     */
    @TableField("affiTypetzCount")
    private Integer affiTypetzCount;

    /**
     * （部委）挂靠类型 学会数
     */
    @TableField("affiTypetaCount")
    private Integer affiTypetaCount;

    /**
     * （中国科协）挂靠类型 学会数
     */
    @TableField("affiTypetbCount")
    private Integer affiTypetbCount;

    /**
     * （中国科学院）挂靠类型 学会数
     */
    @TableField("affiTypetcCount")
    private Integer affiTypetcCount;

    /**
     * （院所）挂靠类型 学会数
     */
    @TableField("affiTypetdCount")
    private Integer affiTypetdCount;

    /**
     * （高校）挂靠类型 学会数
     */
    @TableField("affiTypeteCount")
    private Integer affiTypeteCount;

    /**
     * （公司）挂靠类型 学会数
     */
    @TableField("affiTypetfCount")
    private Integer affiTypetfCount;

    /**
     * （医院）挂靠类型 学会数
     */
    @TableField("affiTypetgCount")
    private Integer affiTypetgCount;

    /**
     * （行业协会）挂靠类型 学会数
     */
    @TableField("affiTypethCount")
    private Integer affiTypethCount;

    /**
     * （多支撑单位）挂靠类型 学会数
     */
    @TableField("affiTypetiCount")
    private Integer affiTypetiCount;

    @TableField("affiTypetjCount")
    private Integer affiTypetjCount;


}
