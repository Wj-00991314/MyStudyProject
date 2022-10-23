package com.wj.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName question_paper
 */
@TableName(value ="question_paper")
@Data
public class QuestionPaper implements Serializable {
    /**
     * 关系编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 试题编号，外键
     */
    private Integer questionId;

    /**
     * 试卷编号，外键
     */
    private Integer paperId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}