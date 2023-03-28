package com.example.image.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * image(Image)entity
 *
 * @author lydia.zhang
 * @since 2023-03-26 14:27:52
 */
public class Image implements Serializable {
    private static final long serialVersionUID = 947529946831014911L;
    /**
    * image id 
    */
    private Integer id;
    /**
    * image_url
    */
    private String imageUrl;
    /**
    * image_label
    */
    private String imageLabel;
    /**
    * create_time
    */
    private Date createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageLabel() {
        return imageLabel;
    }

    public void setImageLabel(String imageLabel) {
        this.imageLabel = imageLabel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
