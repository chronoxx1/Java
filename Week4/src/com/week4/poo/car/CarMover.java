package com.week4.poo.car;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pepe
 */

public class CarMover {
    public static void main(String[] args) {
        List<Wheel> arr=new ArrayList();
        Wheel wh=new Wheel();
        arr.add(wh);
        
        FamilyCar nfc=new FamilyCar();
        nfc.setVelocity(0);
        nfc.setWheels(arr);
        nfc.getWheels();
        nfc.getVelocity();
        nfc.getTrunksize();
        
        Crossover ncoc = new Crossover();
        ncoc.setVelocity(0);
        ncoc.setWheels(arr);
        ncoc.getVelocity();
        ncoc.getWheels();
        ncoc.getSuspensionHeight();
        
        SportsCar nsc = new SportsCar();
        nsc.setVelocity(0);
        nsc.setWheels(arr);
        nsc.getVelocity();
        nsc.getWheels();
        nsc.getAerodinamicalCoed();
    }
}
