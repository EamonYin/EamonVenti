package com.eamonventi.producer.Entity;

/**
 * @author:YiMing
 * @create:2020/11/22,17:00
 * @version:1.0
 */
public class User {
    private long id;
    private String name;
    private int age;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
