package edu.matc.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by kvang on 10/7/17.
 */
@Data
@Entity
@Table(name = "user_roles")
public class UserRoles {

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_pass")
    private String userPass;

}
