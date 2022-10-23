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
 * @TableName exam
 */
@TableName(value ="exam")
@Data
public class Exam implements Serializable {
    /**
     * 考试id
     */
    @TableId(type = IdType.AUTO)
    private Integer examId;

    /**
     * 试卷id，外键
     */
    private Integer paperId;

    /**
     * 开始时间
     */
    private Date examBegin;

    /**
     * 结束时间
     */
    private Date examEnd;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}