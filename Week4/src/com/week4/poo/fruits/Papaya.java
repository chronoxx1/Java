package com.week4.poo.fruits;

/**
 *
 * @author Pepe
 */

public class Papaya extends Fruit{
    private int seed;

    public int getSeed() {
        return seed;
    }

    public void setSeed(int seed) {
        this.seed = seed;
    }

    public Papaya(int seed, String color, int expiration, String size) {
        super(color, expiration, size);
        this.seed = seed;
    }

}
