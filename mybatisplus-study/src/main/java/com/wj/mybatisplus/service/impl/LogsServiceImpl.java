package com.wj.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wj.mybatisplus.entity.Logs;
import com.wj.mybatisplus.service.LogsService;
import com.wj.mybatisplus.mapper.LogsMapper;
import org.springframework.stereotype.Service;

/**
* @author wengjun
* @description 针对表【logs】的数据库操作Service实现
* @createDate 2022-10-24 00:23:47
*/
@Service
public class LogsServiceImpl extends ServiceImpl<LogsMapper, Logs>
    implements LogsService{

}




