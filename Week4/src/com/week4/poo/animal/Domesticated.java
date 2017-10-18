package com.week4.poo.animal;

/**
 *
 * @author Pepe
 */

public class Domesticated extends Animal{
    
    private boolean agressive = false;
    private String typeOfAnimal;

    public Domesticated(String name, String color, int edad, boolean agressive, String typeOfAnimal) {
        super(name, color, edad);
        this.agressive = agressive;
        this.typeOfAnimal = typeOfAnimal;
    }
    
    public boolean isAgressive() {
        return agressive;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }
    
    
    
}
