package StructuralDesignPatterns.CompositeDesign;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java 17 is working!");
        createSmartHomeSyatem();
    }

    public static void createSmartHomeSyatem(){
        Fan fan1 = new Fan();
        AirConditioner ac1 = new AirConditioner();
        CompositeObject floor1 = new CompositeObject();
        floor1.addSmartObject(fan1);
        floor1.addSmartObject(ac1);
        CompositeObject floor2 = new CompositeObject();
        floor2.addSmartObject(new Fan());
        floor2.addSmartObject(new AirConditioner());
        CompositeObject house = new CompositeObject();
        house.addSmartObject(floor1);
        house.addSmartObject(floor2);

        house.turnOn();

        house.turnOff();
        

    }
}