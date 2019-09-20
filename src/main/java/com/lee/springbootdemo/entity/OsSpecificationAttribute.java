package com.lee.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 规格属性表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OsSpecificationAttribute implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规格属性ID
     */
    @TableId(value = "spec_attr_id", type = IdType.AUTO)
    private Long specAttrId;

    /**
     * 规格ID
     */
    private Long specificationId;

    /**
     * 规格属性名称
     */
    private String name;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
