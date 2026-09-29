package StructuralDesignPatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        // create 1000 asteroids in memory
        // using ordinary Asteroid class
        int x = 10;
        int y = 10;
        
        for(int i=0;i<1000;i++){
            Asteroid a = new Asteroid("blue", "blueAsteroid", true, true, x, y, 3, 2);
            x = x+10;
            y = y+10;
        }

        // flyweight part remains constant
        Map<String,flyweightAsteroid> lookup = new HashMap<>();
        lookup.put("blue",new flyweightAsteroid("blue", "blueAsteroid", true, true, 2,2));
        lookup.put("red", new flyweightAsteroid("red", "redAsteroid", true, false, 2,3));
        for(int i=0;i<1000;i++){
            if(i%2==0){
                String blue = "blue";
                AsteroidBetter aBetter = new AsteroidBetter(2, 3, lookup.get(blue));
            }else{
                String red = "red";
                AsteroidBetter aBetter = new AsteroidBetter(2, 3, lookup.get(red));
            }
        }


    }
    
}
