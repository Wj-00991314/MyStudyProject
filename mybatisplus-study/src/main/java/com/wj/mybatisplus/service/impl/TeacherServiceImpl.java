package com.wj.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wj.mybatisplus.entity.Teacher;
import com.wj.mybatisplus.service.TeacherService;
import com.wj.mybatisplus.mapper.TeacherMapper;
import org.springframework.stereotype.Service;

/**
* @author wengjun
* @description 针对表【teacher】的数据库操作Service实现
* @createDate 2022-10-24 00:23:47
*/
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher>
    implements TeacherService{

}




