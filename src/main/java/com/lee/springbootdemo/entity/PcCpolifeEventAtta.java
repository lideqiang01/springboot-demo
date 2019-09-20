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
 * v2组织生活活动附件公共表(弃用)
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCpolifeEventAtta implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "evat_id", type = IdType.AUTO)
    private Long evatId;

    /**
     * 活动类型表外键
     */
    private Long edicId;

    /**
     * 附件路径
     */
    private String path;

    /**
     * 名字
     */
    private String name;

    /**
     * 附件类型：例如：0.word,1.xls,2.png,3.pdf,4.jpg
     */
    private Integer type;

    /**
     * 上传时间
     */
    private LocalDateTime uploadD;

    /**
     * 文件名字
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
     * 活动/会议外键
     */
    private Long evenId;


}
