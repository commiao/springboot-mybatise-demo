package com.activity.mapper;

import com.activity.po.LogMaketEditSpecial;
import com.activity.po.LogMaketEditSpecialExample;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.Matchers.greaterThan;

/**
 * @CreateDate: 2019/11/26 11:38
 * @Description: TODO
 * @author: jingmiao
 * @version: V1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.activity.DemoApplication.class)
public class LogMaketEditSpecialMapperTest {

    @Autowired
    private LogMaketEditSpecialMapper logMaketEditSpecialMapper;

    @Test
    public void countByExample() {
        LogMaketEditSpecialExample example = new LogMaketEditSpecialExample();
        long i = logMaketEditSpecialMapper.countByExample(example);

        Assert.assertThat(i, greaterThan(1l));
    }

    @Test
    public void selectByExample() {
        LogMaketEditSpecialExample example = new LogMaketEditSpecialExample();
        example.createCriteria().andIdLessThan(30l);
        List<LogMaketEditSpecial> list = logMaketEditSpecialMapper.selectByExample(example);
        list.stream().forEach(entity-> System.out.println(entity.getActiName()));
    }
}