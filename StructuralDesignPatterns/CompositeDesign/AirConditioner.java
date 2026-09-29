package StructuralDesignPatterns.CompositeDesign;

public class AirConditioner implements ISmartObject{
    
    @Override 
    public void turnOn(){
        System.out.println("Turn on the AC!");
    }

    @Override 
    public void turnOff(){
        System.out.println("Turn off the AC!");
    }
}
