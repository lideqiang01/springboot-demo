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
public class QrtzSchedulerState implements Serializable {

    private static final long serialVersionUID = 1L;

    private String schedName;

    private String instanceName;

    private Long lastCheckinTime;

    private Long checkinInterval;


}
