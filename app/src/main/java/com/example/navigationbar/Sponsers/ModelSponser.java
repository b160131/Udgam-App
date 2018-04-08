package com.example.navigationbar.Sponsers;



public class ModelSponser {

    private int image;
    private String name, subname;

    public ModelSponser(int image, String name, String subname) {
        this.image = image;
        this.name = name;
        this.subname = subname;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }
}
