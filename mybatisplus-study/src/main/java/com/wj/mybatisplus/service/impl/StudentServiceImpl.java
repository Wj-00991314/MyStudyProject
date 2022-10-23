package com.wj.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wj.mybatisplus.entity.Student;
import com.wj.mybatisplus.service.StudentService;
import com.wj.mybatisplus.mapper.StudentMapper;
import org.springframework.stereotype.Service;

/**
* @author wengjun
* @description 针对表【student】的数据库操作Service实现
* @createDate 2022-10-24 00:23:47
*/
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student>
    implements StudentService{

}




