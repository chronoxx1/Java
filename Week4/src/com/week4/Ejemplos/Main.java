package com.week4.Ejemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Pepe
 */

public class Main {
    
    interface Drawable{
        public void draw();
    }
    
    public static void main(String[] args) {
        
        int width = 100;
        
        Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing "+width);
            }
        };
        
        d.draw();
        
        //Scanner read = new Scanner(System.in);
        
//        int variable = read.nextInt();
//        
//        assert variable > 10:"Chavo";
//        System.out.println(variable);
//        
//        for (semana val : semana.values()) {
//            System.out.println(val);
//        }
//    }
//    
//    public enum semana{Lunes,Martes,Miercoles,Jueves,Viernes,Sabado,Domingo
    
        OtraClase lainterface = (algo) -> {
            return algo;
        };
        
        System.out.println("la interface"+lainterface.tunombre("Panchito"));
        
        
        /////////////////////////////////////
        
        List<Product> list = new ArrayList();
        
        list.add(new Product(1, "Laptop", 5678.50f));
        list.add(new Product(3, "Smart Tv", 10678.50f));
        list.add(new Product(2, "Iphone", 22678.50f));
        list.add(new Product(4, "Fridge", 14312f));
        
        Collections.sort(list,(p1,p2)->{
           return p1.getName().compareTo(p2.getName());
           
           
        });
        
        list.forEach(n -> {
            System.out.println("ID: "+n.getId());
            System.out.println("Name: "+n.getName());
            System.out.println("Price: "+n.getPrice());
        });
    
    }
    
    
    
}
