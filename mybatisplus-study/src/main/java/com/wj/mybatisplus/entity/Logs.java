package com.wj.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName logs
 */
@TableName(value ="logs")
@Data
public class Logs implements Serializable {
    /**
     * 日志id
     */
    @TableId(type = IdType.AUTO)
    private Integer logId;

    /**
     * 模块id，外键
     */
    private Integer moduleId;

    /**
     * 教师id，外键
     */
    private Integer teacherId;

    /**
     * 日志内容
     */
    private String logText;

    /**
     * 日志记录时间
     */
    private Date logTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}