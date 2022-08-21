package com.hutu.lsz.mybatis.entity;

/**
 * @author longshizhuo
 * @auther Shizhuo Long
 * @date 2022/8/18
 * @apiNote
 */
public class User {
    private Integer id;
    private String userName;
    private String password;
    private Integer age;
    private String gender;
    private String email;

    /**
     * Constructor.
     * 空参构造（无参构造）
     */
    public User() {

    }

    /** 全参构造
     * @param id User identifier
     * @param userName User name
     * @param password Password
     * @param age User age
     * @param gender Gender
     * @param email User email
     */
    public User(Integer id, String userName, String password, Integer age, String gender, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
