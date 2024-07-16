package com.cc.java;

public class Cat 
{
   private String name = "Grizabella";
   private String furColor = "white"; 
   private int age = 27; 


    //Konstruktor
    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getFurColor() {
        return furColor;
    }



    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }



    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }


    public boolean getPermission(){
            return true;
            // return false;


    }



    // Rückgabetyp -- Cat
    public Cat getInstanceVariable(){
        return this;
    }

}
