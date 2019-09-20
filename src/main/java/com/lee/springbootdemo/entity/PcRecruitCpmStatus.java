package com.lee.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v3 发展党员状态字典表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcRecruitCpmStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "reps_id", type = IdType.AUTO)
    private Long repsId;

    private String name;

    private Long sort;

    private String mark;

    private Integer level;

    private Integer whDelete;


}
