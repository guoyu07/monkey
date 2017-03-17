package com.suixingpay.monkey.admin.service.bean;

/**
 * Created By Evan Xu
 */
public class User {

    private String name;
    private String password;
    private String sex;
    private String age;
    private String birth;
    private String addr;

    public User() {
    }

    public User(String name, String password, String sex, String age, String birth, String addr) {
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.birth = birth;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}