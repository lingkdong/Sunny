package com.sunny.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by DT254 on 2017/7/3.
 */
@Entity
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;
    private Long userId;
    private Long roleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
