package com.week4.poo.fruits;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pepe
 */

public class Main {
    public static void main(String[] args) {
        List<Papaya> lpapayas = new ArrayList();
        List<waterMelon> lwatermelons = new ArrayList();
        List<Banana> lbananas = new ArrayList();
        List<Carrot> lcarrots = new ArrayList();
        
        for (int i = 0; i < 5; i++) {
            Papaya papaya = new Papaya(15, "Orange", 5, "40cm");
            lpapayas.add(papaya);
            waterMelon watermelon = new waterMelon("Yellow", 7, "50cm");
            lwatermelons.add(watermelon);
            Banana banana = new Banana("Yellow", 3, "15cm");
            lbananas.add(banana);
            Carrot carrot = new Carrot("Orange", 6, "17cm");
            lcarrots.add(carrot);
        }
        
        fruitStorage storage = new fruitStorage(lpapayas, lwatermelons, lbananas, lcarrots);
        
        Fridge fridge = new Fridge(4, storage);
        
        storage.checkFruits();
        storage.showFruits();
        storage.checkVegetables();
        storage.showVegetables();
        
        
    }
}
