package com.example.products;

public class MainModel {
    String purl,name,type,description,price;

    MainModel(){}

    public MainModel(String purl, String name, String type, String description, String price) {
        this.purl = purl;
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
