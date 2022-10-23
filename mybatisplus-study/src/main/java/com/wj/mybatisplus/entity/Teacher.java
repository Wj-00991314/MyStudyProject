package com.wj.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName teacher
 */
@TableName(value ="teacher")
@Data
public class Teacher implements Serializable {
    /**
     * 老师编号
     */
    @TableId(type = IdType.AUTO)
    private Integer teacherId;

    /**
     * 姓名
     */
    private String teacherName;

    /**
     * 老师登录账号
     */
    private String teacherAccount;

    /**
     * 邮箱
     */
    private String teacherEmail;

    /**
     * 密码
     */
    private String teacherPwd;

    /**
     * 权限值
     */
    private Integer power;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}