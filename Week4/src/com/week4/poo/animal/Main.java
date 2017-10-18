package com.week4.poo.animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pepe
 */
public class Main {

    static Scanner read = new Scanner(System.in);
    static List<Domesticated> D = new ArrayList();
    static List<noDomesticated> nD = new ArrayList();

    public static void main(String[] args) {
        init();

    }

    public static void init() {
        String n, c;
        int a;
        String repeat = "yes";
        do {
            System.out.println("Select an animal (mouse/cat/dog/lion) :");
            String an = read.nextLine();

            if (an.equalsIgnoreCase("mouse") || an.equalsIgnoreCase("dog") || an.equalsIgnoreCase("cat") || an.equalsIgnoreCase("lion")) {
                System.out.print("Name: ");
                n = read.nextLine();
                System.out.print("Age: ");
                a = read.nextInt();read.nextLine();
                System.out.print("Color: ");
                c = read.nextLine();
                an = an.toLowerCase();
                switch (an) {
                    case "mouse":
                        Mouse mouse = new Mouse(n, c, a, false, an);
                        D.add(mouse);
                        System.out.println("a mouse was created");
                        mouse.eat("cheese");
                        System.out.println("\n\n");
                        break;
                    case "dog":
                        Dog dog = new Dog(an, c, a, false, an);
                        D.add(dog);
                        System.out.println("a dog was created");
                        dog.bark();
                        System.out.println("\n\n");
                        break;
                    case "cat":
                        Cat cat = new Cat(an, c, a, false, an);
                        D.add(cat);
                        System.out.println("a cat was created");
                        cat.sleep();
                        System.out.println("\n\n");
                        break;
                    case "lion":
                        Lion lion = new Lion(an, c, a, true, an);
                        nD.add(lion);
                        System.out.println("a lion was created");
                        lion.eat("meat");
                        System.out.println("\n\n");
                        break;

                    default:
                        throw new AssertionError();
                }
            } else {
                System.out.println("you cant create that animal");
                //init();
            }
            System.out.print("Do you want to create another animal? ");
            repeat = read.nextLine();
        } while (repeat.equalsIgnoreCase("yes"));
        show();
    }

    public static void show() {
        System.out.println("//////////////////////////");
        System.out.println("Animals in your farm!");
        System.out.println("//////////////////////////");
        for (Domesticated an : D) {
            System.out.println("Animal: " + an.getTypeOfAnimal() + "\nName: " + an.getName() + "\nAge: " + an.getAge() + "\nColor: " + an.getColor() + "\nAggressive: " + an.isAgressive());
            System.out.println("**********************");
        }
        for (noDomesticated an : nD) {
            System.out.println("Animal: " + an.getTypeOfAnimal() +"\nName: " + an.getName() + "\nAge: " + an.getAge() + "\nColor: " + an.getColor() + "\nAggressive: " + an.isAggressive());
            System.out.println("**********************");
        }
        System.out.println("//////////////////////////");
    }
}
