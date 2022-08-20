package com.example.appxephinh.Model;

public class ConVat {
    private int id;
    private int imageConVat;

    public ConVat() {
    }

    public ConVat(int id, int imageConVat) {
        this.id = id;
        this.imageConVat = imageConVat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageConVat() {
        return imageConVat;
    }

    public void setImageConVat(int imageConVat) {
        this.imageConVat = imageConVat;
    }
}
