package com.sunny.web.model;

import javax.persistence.*;

/**
 * Created by DT254 on 2017/6/21.
 */
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;

    @Column(name = "role_name",unique = true,length = 20,nullable = false)
    private String roleName;

    @Column(name = "description",unique = true,length = 50)
    private String description;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
