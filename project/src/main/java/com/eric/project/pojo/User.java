package com.eric.project.pojo;

/**
 * description
 *
 * @author ericzhang 2021/11/12 9:43 下午
 */
public class User {

    private String userName;
    private Integer userId;
    private Integer userGender;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }
}
