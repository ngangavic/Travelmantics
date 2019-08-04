package com.ngangavictor.travelmantic;

import java.io.Serializable;

public class TravelDeal implements Serializable {
    private String id;
    private String title;
    private String description;
    private String price;
    private String url;
    private String imgName;

    //constructors


    public TravelDeal() {
    }

    public TravelDeal(String id, String title, String description, String price, String url, String imgName) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.url = url;
        this.imgName = imgName;
    }

    //getters

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public String getUrl() {
        return url;
    }

    public String getImgName() {
        return imgName;
    }

    //setters


    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }
}
