package com.wj.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName question
 */
@TableName(value ="question")
@Data
public class Question implements Serializable {
    /**
     * 题目编号
     */
    @TableId(type = IdType.AUTO)
    private Integer questionId;

    /**
     * 题目类型x单选，y多选，z判断
     */
    private String questionType;

    /**
     * 问题属性，如Java
     */
    private String questionCourse;

    /**
     * 题目问题
     */
    private String questionName;

    /**
     * 选项A
     */
    private String questionOpa;

    /**
     * 选项B
     */
    private String questionOpb;

    /**
     * 选项C
     */
    private String questionOpc;

    /**
     * 选项D
     */
    private String questionOpd;

    /**
     * 正确选项
     */
    private String questionOpright;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}