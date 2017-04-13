package com.sunny.web.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by DT254 on 2017/4/13.
 */
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "name",length = 50,nullable = false)
    private String name;

    private Date createTime;

    private Date lastUpateTime;

    public Date getLastUpateTime() {
        return lastUpateTime;
    }

    public void setLastUpateTime(Date lastUpateTime) {
        this.lastUpateTime = lastUpateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
