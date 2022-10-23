package com.wj.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wj.mybatisplus.entity.Exam;
import com.wj.mybatisplus.service.ExamService;
import com.wj.mybatisplus.mapper.ExamMapper;
import org.springframework.stereotype.Service;

/**
* @author wengjun
* @description 针对表【exam】的数据库操作Service实现
* @createDate 2022-10-24 00:23:47
*/
@Service
public class ExamServiceImpl extends ServiceImpl<ExamMapper, Exam>
    implements ExamService{

}




