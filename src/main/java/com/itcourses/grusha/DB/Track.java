package com.itcourses.grusha.DB;

public class Track {

    private String name;
    private String composer;
    private Double price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getComposer() {
        return composer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return composer == null ? String.format("Track: [%s]  with price [%s]", name, price) : String.format("Track: [%s] by [%s] with price [%s]", name, getComposer(), price);
    }
}
