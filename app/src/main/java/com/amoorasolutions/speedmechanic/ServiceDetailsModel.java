package com.amoorasolutions.speedmechanic;

public class ServiceDetailsModel {
    private String head,cost, sub;
    private int image;

    public ServiceDetailsModel() {
    }



    public ServiceDetailsModel(String head, String cost, String sub, int image) {
        this.head = head;
        this.cost = cost;
        this.sub = sub;

        this.image = image;

    }
    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
