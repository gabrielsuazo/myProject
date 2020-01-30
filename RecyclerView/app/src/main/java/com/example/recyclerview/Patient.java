package com.example.recyclerview;

public class Patient {

    private String nom, date;
    private int img;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    Patient(String name, String date, int img){
        this.setNom(name);
        this.setDate(date);
        this.setImg(img);
    }
}
