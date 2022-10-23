package com.wj.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wj.mybatisplus.entity.Paper;
import com.wj.mybatisplus.service.PaperService;
import com.wj.mybatisplus.mapper.PaperMapper;
import org.springframework.stereotype.Service;

/**
* @author wengjun
* @description 针对表【paper】的数据库操作Service实现
* @createDate 2022-10-24 00:23:47
*/
@Service
public class PaperServiceImpl extends ServiceImpl<PaperMapper, Paper>
    implements PaperService{

}




