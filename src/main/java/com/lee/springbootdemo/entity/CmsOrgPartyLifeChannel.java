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
 * 党组织生活栏目表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CmsOrgPartyLifeChannel implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 主题/栏目
     */
    private String channel;

    /**
     * 主题创建时间
     */
    private LocalDateTime createTime;

    /**
     * 状态(预留)用于栏目关闭等
     */
    private Integer state;

    /**
     * 1(学会党委工作)2(基层党组织生活)
     */
    private Integer type;

    /**
     * 编号
     */
    private String code;


}
