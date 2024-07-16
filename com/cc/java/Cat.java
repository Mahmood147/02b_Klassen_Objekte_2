package com.cc.java;

public class Cat 
{
    String name = "Grizabella";
    String furColor = "white"; 
    int age = 27; 


    
    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }



    // Rückgabetyp -- Cat
    public Cat getInstanceVariable(){
        return this;
    }

}
