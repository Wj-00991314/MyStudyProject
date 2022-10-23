package com.wj.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName classe
 */
@TableName(value ="classe")
@Data
public class Classe implements Serializable {
    /**
     * 班级id
     */
    @TableId(type = IdType.AUTO)
    private Integer classeId;

    /**
     * 班级名
     */
    private String classeName;

    /**
     * 教师id，外键
     */
    private Integer teacherId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}