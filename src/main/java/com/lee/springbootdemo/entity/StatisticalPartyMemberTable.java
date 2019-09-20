package com.lee.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 党组织情况统计表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class StatisticalPartyMemberTable implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 成立总计
     */
    @TableField("partyTotle")
    private Integer partyTotle;

    /**
     * 学会党组织
     */
    @TableField("nacPartyTotle")
    private Integer nacPartyTotle;

    /**
     * 办事机构党组织
     */
    @TableField("boPartyTotle")
    private Integer boPartyTotle;

    /**
     * 报备党组织
     */
    @TableField("reportPartyTotle")
    private Integer reportPartyTotle;

    /**
     * 查询日期
     */
    @TableField("searchDate")
    private LocalDate searchDate;


}
