package com.week4.poo.fruits;

/**
 *
 * @author Pepe
 */

public class Fridge {
    private int temperature;
    private fruitStorage storage;

    public Fridge(int temperature, fruitStorage storage) {
        this.temperature = temperature;
        this.storage = storage;
    }
    
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public fruitStorage getStorage() {
        return storage;
    }

    public void setStorage(fruitStorage storage) {
        this.storage = storage;
    }  
    
}
