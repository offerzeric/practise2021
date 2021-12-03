package com.eric.project.pojo;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * pojo
 *
 * @author ericzhang 2021/11/12 3:30 下午
 */
@ConfigurationProperties(prefix = "person")
public class Person {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
