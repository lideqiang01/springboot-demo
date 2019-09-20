package com.lee.springbootdemo.entity;

import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 接受通知人员表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MsgOrgPartyReceiver implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 党组织id
     */
    private String cpowId;

    /**
     * 用户组ID
     */
    private String usergroupId;

    /**
     * 通知ID
     */
    private String informId;

    /**
     * 是否已读 0：未读，1：已读
     */
    private Integer isRead;

    /**
     * 查看日期
     */
    @TableField("viewDate")
    private LocalDate viewDate;

    /**
     * 是否查看(0:已读1:未读)
     */
    private Integer state;


}
