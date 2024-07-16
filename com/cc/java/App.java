package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Instanziierung  --> Erzeugen eines Objektes
        // System.out.println(new Cat());

        // cat --> Referenzvariable
        // Cat --> Referenztyp(Klasse)
        Cat cat = new Cat("Grizabella","White ", 27);
        output("Blick von aussen: " + cat);
        output("Blick von innen: " + cat.getInstanceVariable());


        
        output(cat.name);
        output(cat.furColor);
        output(Integer.toString(cat.age));


        System.out.println("----------------------------");

        Cat cat2 = new Cat("Alonzo", "Grey", 35);
        output("Blick von aussen: " + cat2);
        output("Blick von innen: " + cat2.getInstanceVariable());


        output(cat2.name);
        output(cat2.furColor);
        output(Integer.toString(cat2.age));
    }

       


      // Statische Methode, die in der Klasse ausgeführt wird ...
    public static void output(String outputStr){
        System.out.println(outputStr);
    }
   
}

