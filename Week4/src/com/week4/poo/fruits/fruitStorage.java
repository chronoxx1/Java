package com.week4.poo.fruits;

import java.util.List;

/**
 *
 * @author Pepe
 */

public class fruitStorage {
    private List<Papaya> papayas;
    private List<waterMelon> watermelons;
    private List<Banana> bananas;
    private List<Carrot> carrots;

    public fruitStorage(List<Papaya> lPapayas, List<waterMelon> watermelons, List<Banana> bananas, List<Carrot> carrots) {
        this.papayas = lPapayas;
        this.watermelons = watermelons;
        this.bananas = bananas;
        this.carrots = carrots;
    }
    
    public void checkFruits(){
        System.out.println("**********");
        System.out.println(bananas.size()+" Bananas");
        System.out.println(papayas.size()+" Papayas");
        System.out.println(watermelons.size()+" watermelons");
        System.out.println("**********\n\n");
    }
    
    public void checkVegetables(){
        System.out.println("**********");
        System.out.println(carrots.size()+" Carrots");
        System.out.println("**********\n\n");
    }
    
    public void showFruits(){
        System.out.println("//Bananas//");
        for (Banana b : bananas) {
            System.out.println("Color :"+b.getColor()+"\nSize: "+b.getSize()+"\nExpiration: "+b.getExpiration());
            System.out.println("-------------");
        }
        System.out.println("\n//Papayas//");
        for (Papaya p : papayas) {
            System.out.println("Color :"+p.getColor()+"\nSize: "+p.getSize()+"\nExpiration: "+p.getExpiration()+"\nSeeds: "+p.getSeed());
            System.out.println("-------------");
        }
        System.out.println("\n//Water Melons//");
        for (waterMelon w : watermelons) {
            System.out.println("Color :"+w.getColor()+"\nSize: "+w.getSize()+"\nExpiration: "+w.getExpiration());
            System.out.println("-------------");
        }
    }
    
    public void showVegetables(){
        System.out.println("//Carrots//");
        for (Carrot c : carrots) {
            System.out.println("Color :"+c.getColor()+"\nSize: "+c.getSize()+"\nExpiration: "+c.getExpiration());
            System.out.println("-------------");
        }
    }
    
}
