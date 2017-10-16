package com.zzgo.web.model;

import java.util.Date;

/**
 * <p>角色实体</p>
 * Created by 9527 on 2017/10/12.
 */
public class Role {
    private int id;
    private String name;
    private String note;
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
