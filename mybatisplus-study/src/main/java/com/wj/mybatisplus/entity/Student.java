package com.wj.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName student
 */
@TableName(value ="student")
@Data
public class Student implements Serializable {
    /**
     * 学生编号，默认生成
     */
    @TableId(type = IdType.AUTO)
    private Integer studentId;

    /**
     * 学生姓名
     */
    private String studentName;

    /**
     * 账号
     */
    private String studentAccount;

    /**
     * 性别
     */
    private Integer studentGender;

    /**
     * 邮箱
     */
    private String studentEmail;

    /**
     * 密码
     */
    private String studentPwd;

    /**
     * 对应班级，外键
     */
    private Integer classeId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}