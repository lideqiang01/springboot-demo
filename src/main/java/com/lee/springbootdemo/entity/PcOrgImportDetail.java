package com.lee.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class PcOrgImportDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String error;

    private Integer importIndex;

    private String importNo;

    private String name;

    private String orgInternalCode;

    private String parentCode;

    private String pccpEmail;

    private String pccpName;

    private String pccpPhone;

    private String pccpVerificationCode;

    private Integer status;


}
