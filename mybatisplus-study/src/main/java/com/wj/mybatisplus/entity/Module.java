package com.wj.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName module
 */
@TableName(value ="module")
@Data
public class Module implements Serializable {
    /**
     * 模块id
     */
    @TableId(type = IdType.AUTO)
    private Integer moduleId;

    /**
     * 模块名
     */
    private String moduleName;

    /**
     * 模块请求路径
     */
    private String moduleUrl;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}