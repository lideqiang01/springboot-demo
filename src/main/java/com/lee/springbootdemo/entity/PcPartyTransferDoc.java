package com.lee.springbootdemo.entity;

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
public class PcPartyTransferDoc implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 基层党组织党员管理文件表
     */
    private Long id;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 文件类型
     */
    private Integer fileType;

    /**
     * 文件路径
     */
    private String filePath;

    /**
     * 文件后缀
     */
    private String docType;

    /**
     * 基层党组织党员管理id（外键）
     */
    private Long partyTransferId;


}
