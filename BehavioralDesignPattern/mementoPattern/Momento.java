package BehavioralDesignPattern.mementoPattern;

import java.util.HashMap;
import java.util.Map;

public class Momento {
    Map<String,String> store;

    public Momento(Database o){
        store = new HashMap<>(o.getStore());
    }

    public  Map<String,String> getSnapShot(){
        return store;
    }
}
