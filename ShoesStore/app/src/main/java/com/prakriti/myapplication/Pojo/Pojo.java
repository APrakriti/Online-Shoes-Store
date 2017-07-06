package com.prakriti.myapplication.Pojo;

import java.io.Serializable;

/**
 * Created by aprakriti on 5/9/2017.
 */

public class Pojo implements Serializable {
    String id, price, quality, image, description;


    public Pojo(String id, String price, String quality, String image, String description) {
        this.id = id;
        this.price = price;
        this.quality = quality;
        this.image = image;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
