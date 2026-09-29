package StructuralDesignPatterns.flyweight;

public class flyweightAsteroid {
    String color;
    String name;
    Boolean sparkles;
    Boolean multicolor;
    int speed;
    int acceleration;

    public flyweightAsteroid(String color,String name, Boolean sparkles,Boolean multicolor,int speed,int acceleration){
        this.color = color;
        this.name = name;
        this.sparkles = sparkles;
        this.multicolor = multicolor;
        this.speed = speed;
        this.acceleration = acceleration;
    }
    
}