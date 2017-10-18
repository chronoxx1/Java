package com.week4.poo.animal;

/**
 *
 * @author Pepe
 */
public class Mouse extends Domesticated{

    public Mouse(String name, String color, int edad, boolean agressive, String typeOfAnimal) {
        super(name, color, edad, agressive, typeOfAnimal);
    }

    @Override
    public void eat(String meal){
        if (meal.equalsIgnoreCase("cheese")) {
            System.out.println("Yummi cheese!!!");
        }else{
            System.out.println("IUK :(");
        }
    }
}
