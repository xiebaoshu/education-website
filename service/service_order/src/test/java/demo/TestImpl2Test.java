package demo;

import com.atguigu.commonutils.ordervo.CourseWebVoOrder;
import com.atguigu.commonutils.ordervo.UcenterMemberOrder;
import com.atguigu.eduorder.OrdersApplication;
import com.atguigu.eduorder.client.EduClient;
import com.atguigu.eduorder.client.UcenterClient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = OrdersApplication.class )//这里是启动类
public class TestImpl2Test {
    @Autowired
    private UcenterClient ucenterClient;
    @Autowired
    private EduClient eduClient;

    @Test
    public void test(){
        UcenterMemberOrder info = ucenterClient.getUserInfoOrder("1264460120641777666");
        System.out.println(info);
    }
    @Test
    public void test1(){
        CourseWebVoOrder courseInfoOrder = eduClient.getCourseInfoOrder("1192252213659774977");
        System.out.println(courseInfoOrder);
    }


}