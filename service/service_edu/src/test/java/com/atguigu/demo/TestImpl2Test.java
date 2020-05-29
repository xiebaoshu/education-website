package com.atguigu.demo;

import com.atguigu.commonutils.ordervo.UcenterMemberOrder;
import com.atguigu.eduservice.EduApplication;

import com.atguigu.eduservice.client.UcenterClient;
import com.atguigu.eduservice.service.EduCommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = EduApplication.class )//这里是启动类
public class TestImpl2Test {
    @Autowired
    private UcenterClient ucenterClient;

    @Test
    public void test(){
        UcenterMemberOrder info = ucenterClient.getInfo("1264460120641777666");
        System.out.println(info);
    }


}