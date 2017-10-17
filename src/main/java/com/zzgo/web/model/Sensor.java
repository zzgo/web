package com.zzgo.web.model;

/**
 * <p>传感器实体</p>
 * Created by 9527 on 2017/10/12.
 */
public class Sensor {
    private int id;
    private String model;//型号
    private String location;//位置
    private int happenCount;//发生次数
    private int isFocus;//是否关注
    private int isNormal;//是否正常
    private int createTime;//创建时间
    private String note;//备注

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getHappenCount() {
        return happenCount;
    }

    public void setHappenCount(int happenCount) {
        this.happenCount = happenCount;
    }

    public int getIsFocus() {
        return isFocus;
    }

    public void setIsFocus(int isFocus) {
        this.isFocus = isFocus;
    }

    public int getIsNormal() {
        return isNormal;
    }

    public void setIsNormal(int isNormal) {
        this.isNormal = isNormal;
    }

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
