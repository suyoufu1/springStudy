package com.syf.spring_study.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by syf on 2020/9/8
 */

public class UserT implements Serializable {

    private String name ;

    private Integer age ;

   public UserT(){
       System.out.println ("name = syf " );
   }
}
