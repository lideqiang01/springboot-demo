package com.lee.springbootdemo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品规格表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OsProductSpecification implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品规格ID
     */
    @TableId(value = "product_spec_id", type = IdType.AUTO)
    private Long productSpecId;

    /**
     * 商品规格编号
     */
    private Long productSpecNumber;

    /**
     * 商品ID
     */
    private Long productId;

    /**
     * 规格：规格ID，以“,”相隔
     */
    private String spec;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 销售量
     */
    private Integer salesVolume;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 积分
     */
    private Integer score;

    /**
     * 是否默认状态：0,不默认；1,默认
     */
    private Integer defaultStatus;

    /**
     * 商品状态：0,新增；1,上架；2,下架
     */
    private Integer status;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
