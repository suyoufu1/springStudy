package com.syf.spring_study;

import com.syf.spring_study.pojo.Student;
import com.syf.spring_study.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class SpringStudyApplicationTests {

    @Test
    void contextLoads() {
        //获取spring的上下文对象
       ApplicationContext context = new ClassPathXmlApplicationContext ("beans.xml");
       //我们的对象都在spring管理了，直接取出来就行了
        User user = (User) context.getBean (" user");
        System.out.println (user.toString ());
    }
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext ("bean_DI.xml");
        Student student = (Student) context.getBean ("student");
        System.out.printf ("name:", student.getName ());
    }

}
