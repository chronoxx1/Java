package com.week4.poo.fruits;

/**
 *
 * @author Pepe
 */

public class Vegetable {
    private String color;
    private int expiration;
    private String size;

    public Vegetable(String color, int expiration, String size) {
        this.color = color;
        this.expiration = expiration;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getExpiration() {
        return expiration;
    }

    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
}
