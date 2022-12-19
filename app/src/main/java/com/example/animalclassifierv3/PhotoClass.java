package com.example.animalclassifierv3;

public class PhotoClass {
    public String url;
    public String caption;

    PhotoClass(){}

    PhotoClass(String url, String caption) {
        this.url = url;
        this.caption = caption;
    }

    public String getCaption() {
        return caption;
    }

    public String getUrl() {
        return url;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
