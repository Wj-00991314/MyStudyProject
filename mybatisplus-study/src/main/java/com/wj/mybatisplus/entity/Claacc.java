package com.wj.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName claacc
 */
@TableName(value ="claacc")
@Data
public class Claacc implements Serializable {
    /**
     * 及格率表,由于后台直接在Controller处理了，故此表为空
     */
    @TableId(type = IdType.AUTO)
    private Integer clasaccId;

    /**
     * 
     */
    private String examName;

    /**
     * 
     */
    private Integer claId;

    /**
     * 
     */
    private Integer toscPer;

    /**
     * 
     */
    private Integer acscPer;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}