package edu.matc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by kvang on 10/7/17.
 */
@Entity
@Table(name = "user_roles")
public class UserRoles {

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_pass")
    private String userPass;

    public UserRoles() {
    }

    public UserRoles(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    @Override
    public String toString() {
        return "UserRoles{" +
                "userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                '}';
    }
}
