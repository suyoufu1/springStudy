package com.syf.spring_study.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by syf on 2020/9/8
 */
@Getter
@Setter
@ToString
public class User implements Serializable {

    private String name ;

    private Integer age ;

    @Override
    public int hashCode() {
        return super.hashCode ();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals (obj);
    }
}
