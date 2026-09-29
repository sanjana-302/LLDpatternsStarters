package StructuralDesignPatterns.CompositeDesign;

public class Fan implements ISmartObject{
    
    @Override 
    public void turnOn(){
        System.out.println("Turn on the fan!");
    }

    @Override 
    public void turnOff(){
        System.out.println("Turn off the fan");
    }
}
