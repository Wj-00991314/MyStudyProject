package com.wj.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wj.mybatisplus.entity.Question;
import com.wj.mybatisplus.service.QuestionService;
import com.wj.mybatisplus.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author wengjun
* @description 针对表【question】的数据库操作Service实现
* @createDate 2022-10-24 00:23:47
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}




