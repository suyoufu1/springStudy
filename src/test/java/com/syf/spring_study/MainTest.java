package com.syf.spring_study;

import com.syf.spring_study.pojo.Student;
import com.syf.spring_study.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by syf on 2020/9/8
 */
public class MainTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext ("bean_DI.xml");
        Student student = (Student) context.getBean ("student");
        System.out.println (student.getName ());
        System.out.println (student.getBooks ());
    }
}
