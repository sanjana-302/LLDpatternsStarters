package StructuralDesignPatterns.flyweight;

public class AsteroidBetter {

    int xCordinate;
    int yCordinate;

    flyweightAsteroid f;

    public AsteroidBetter(int x,int y,flyweightAsteroid fa){
        this.xCordinate = x;
        this.yCordinate = y;
        this.f = fa;
    }
}
