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
 * @TableName record
 */
@TableName(value ="record")
@Data
public class Record implements Serializable {
    /**
     * 记录编号
     */
    @TableId(type = IdType.AUTO)
    private Integer recordId;

    /**
     * 考试名称
     */
    private String recordName;

    /**
     * 学生id
     */
    private Integer studentId;

    /**
     * 试卷id
     */
    private Integer paperId;

    /**
     * 答题记录
     */
    private String recordAnswer;

    /**
     * 正确率
     */
    private Double recordAcc;

    /**
     * 得分
     */
    private Integer recordScore;

    /**
     * 提交时间
     */
    private Date submitTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}