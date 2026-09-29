package StructuralDesignPatterns.flyweight;

public class Asteroid {
    String color;
    String name;
    Boolean sparkles;
    Boolean multicolor;
    int xCordinate;
    int yCordinate;
    int speed;
    int acceleration;

    public Asteroid(String color,String name, Boolean sparkles,Boolean multicolor,int x,int y,int speed,int acceleration){
        this.color = color;
        this.name = name;
        this.sparkles = sparkles;
        this.multicolor = multicolor;
        this.xCordinate = x;
        this.yCordinate = y;
        this.speed = speed;
        this.acceleration = acceleration;
    }
    
}
