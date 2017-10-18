package com.week4.poo.car;

import java.util.List;

/**
 *
 * @author Pepe
 */

public class Car {
    private int velocity;
    private List<Wheel> wheels;

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }
    
}
