package StructuralDesignPatterns.CompositeDesign;
import java.util.ArrayList;
import java.util.List;;

public class CompositeObject implements ISmartObject{
    
    List<ISmartObject> collection = new ArrayList<>();

    public void addSmartObject(ISmartObject o){
        collection.add(o);
    }

    public void removeSmartObject(ISmartObject o){
        collection.remove(o);
    }

    @Override 
    public void turnOn(){
        for(ISmartObject o: collection){
            o.turnOn();
        }
    }

    @Override 
    public void turnOff(){
        for(ISmartObject o: collection){
            o.turnOff();
        }
    }
    
}
