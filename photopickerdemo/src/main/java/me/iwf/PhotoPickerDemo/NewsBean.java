package me.iwf.PhotoPickerDemo;

import java.io.Serializable;

/**
 * Created by wangjuan on 2015/4/28.
 */
public class NewsBean implements Serializable {
    private String id;
    private String titleBig;
    private String titleSmall;
    private String content;
    private String picTopStatus;
    private String picTop;
    private String picSmall;
    private String publishTime;
    private String category;
    private String top;
    private String publishUnit;

    public NewsBean(String id,String titleBig, String publishUnit, String top, String category, String publishTime, String picSmall, String picTopStatus, String picTop, String content, String titleSmall) {
        this.id = id;

        this.titleBig = titleBig;
        this.publishUnit = publishUnit;
        this.top = top;
        this.category = category;
        this.publishTime = publishTime;
        this.picSmall = picSmall;
        this.picTopStatus = picTopStatus;
        this.picTop = picTop;
        this.content = content;
        this.titleSmall = titleSmall;
    }
    public NewsBean() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getTitleBig() {
        return titleBig;
    }

    public void setTitleBig(String titleBig) {
        this.titleBig = titleBig;
    }

    public String getPublishUnit() {
        return publishUnit;
    }

    public void setPublishUnit(String publishUnit) {
        this.publishUnit = publishUnit;
    }

    public String getTitleSmall() {
        return titleSmall;
    }

    public void setTitleSmall(String titleSmall) {
        this.titleSmall = titleSmall;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPicTopStatus() {
        return picTopStatus;
    }

    public void setPicTopStatus(String picTopStatus) {
        this.picTopStatus = picTopStatus;
    }

    public String getPicTop() {
        return picTop;
    }

    public void setPicTop(String picTop) {
        this.picTop = picTop;
    }

    public String getPicSmall() {
        return picSmall;
    }

    public void setPicSmall(String picSmall) {
        this.picSmall = picSmall;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }
}
