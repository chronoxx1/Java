package com.week4.poo.animal;

/**
 *
 * @author Pepe
 */

public class noDomesticated extends Animal{
    private boolean aggressive = true;
    private String typeOfAnimal;

    public noDomesticated(String name, String color, int edad, boolean aggressive, String typeOfAnimal) {
        super(name, color, edad);
        this.aggressive = aggressive;
        this.typeOfAnimal = typeOfAnimal;
    }

    public boolean isAggressive() {
        return aggressive;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }
    
    
}
