package com.wj.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName toscore
 */
@TableName(value ="toscore")
@Data
public class Toscore implements Serializable {
    /**
     * 编号
     */
    @TableId(type = IdType.AUTO)
    private Integer toscoreId;

    /**
     * 试卷id
     */
    private Integer paperId;

    /**
     * 总分
     */
    private Integer toscore;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}