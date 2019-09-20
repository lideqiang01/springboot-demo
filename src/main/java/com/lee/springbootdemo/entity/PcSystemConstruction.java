package com.lee.springbootdemo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v3 制度建设
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcSystemConstruction implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sycnId;

    /**
     * 制度类型外键
     */
    private Integer stcpId;

    /**
     * 学会id
     */
    private Long orgId;

    /**
     * 学会党委id
     */
    private String cponaId;

    /**
     * 标题
     */
    private String title;

    /**
     * 创建时间
     */
    private LocalDateTime createD;

    /**
     * 创建人(用户id)
     */
    private String createP;

    /**
     * 报送时间
     */
    private LocalDateTime submitD;

    /**
     * 内容
     */
    private String content;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 编号
     */
    private String docNum;

    private Integer whDelete;

    private Long sort;

    private Integer level;

    private String mark;


}
