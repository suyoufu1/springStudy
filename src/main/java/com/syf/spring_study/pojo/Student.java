package com.syf.spring_study.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by syf on 2020/9/10
 *
 * 依赖注入：
 *  什么是依赖：bean对象的创建依赖于容器
 *  什么是注入：bean对象中的所有属性，都让容器来注入
 */
@Getter
@Setter
@ToString
public class Student implements Serializable {

    private String name ;
    private User user ;
    private String[] books ;
    private List<String> hobbies ;
    private Map<String,String> card ;
    private Set<String> games ;
    private Properties info ;

}
