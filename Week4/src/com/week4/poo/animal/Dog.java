package com.week4.poo.animal;

/**
 *
 * @author Pepe
 */

public class Dog extends Domesticated{

    public Dog(String name, String color, int edad, boolean agressive, String typeOfAnimal) {
        super(name, color, edad, agressive, typeOfAnimal);
    }
    
    public void bark(){
        System.out.println("Baaark baaark bark");
    }
    
    @Override
    public void eat(String meal){
        if (meal.equalsIgnoreCase("dogs food")) {
            System.out.println("Yummi Baark bark");
        }else{
            System.out.println("Iuk Grrrrrr Baaark");
        }
    }
}
