package com.wj.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName paper
 */
@TableName(value ="paper")
@Data
public class Paper implements Serializable {
    /**
     * 试卷id
     */
    @TableId(type = IdType.AUTO)
    private Integer paperId;

    /**
     * 试卷名
     */
    private String paperName;

    /**
     * 单选分数
     */
    private Integer scoreSin;

    /**
     * 多选分数
     */
    private Integer scoreChe;

    /**
     * 判断分数
     */
    private Integer scoreJug;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}