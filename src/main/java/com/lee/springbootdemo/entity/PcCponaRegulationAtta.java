package com.lee.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2_工作规章制度附件表（弃用）
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCponaRegulationAtta implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "atta_id", type = IdType.AUTO)
    private Long attaId;

    /**
     * 附件路径
     */
    private String path;

    /**
     * 附件名称
     */
    private String name;

    /**
     * 文件名
     */
    private String filename;

    /**
     * 下载次数
     */
    private Integer downloadNum;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 标识
     */
    private String mark;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 是否删除
     */
    private Integer wDelete;

    /**
     * 工作规章制度id
     */
    private Long reguId;

    /**
     * 附件类型：0.word,1.xls,2.png,3.pdf,4.jpg
     */
    private Integer type;


}
