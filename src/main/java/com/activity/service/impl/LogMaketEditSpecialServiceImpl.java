package com.activity.service.impl;

import com.activity.mapper.LogMaketEditSpecialMapper;
import com.activity.po.LogMaketEditSpecial;
import com.activity.po.LogMaketEditSpecialExample;
import com.activity.service.LogMaketEditSpecialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @CreateDate: 2019/11/26 14:48
 * @Description: TODO
 * @author: jingmiao
 * @version: V1.0
 */
@Service
public class LogMaketEditSpecialServiceImpl implements LogMaketEditSpecialService {
    @Autowired
    private LogMaketEditSpecialMapper logMaketEditSpecialMapper;

    @Override
    public List<LogMaketEditSpecial> getLogMaketEditSpecialList(){
        LogMaketEditSpecialExample example = new LogMaketEditSpecialExample();
        example.createCriteria().andIdLessThan(30l);
        return logMaketEditSpecialMapper.selectByExample(example);
    }
}
