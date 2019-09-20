package com.lee.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2省份表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcAddressProvince implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @TableField("provinceID")
    private Long provinceID;

    private String province;


}
