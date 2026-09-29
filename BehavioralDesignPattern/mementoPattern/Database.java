package BehavioralDesignPattern.mementoPattern;

import java.util.HashMap;
import java.util.Map;

public class Database implements Originator{

    Map<String,String> store = new HashMap<>();
    private Caretaker recordState = new Caretaker();

    @Override
    public Boolean stateFull() {
        return true;
    }

    public Map<String, String> getStore() {
        return store;
    }

    // returns true if addition was successfull 
    public Boolean addEntry(String key,String val){
        try {
            Momento m = new Momento(this); // create snapshot 
            recordState.addToState(m); // hand over to caretaker
            store.put(key, val);
            return true;
        } catch (Exception e) {
            System.out.print(e);
            return false;
        }
        
    }

    public void showCurrentDb(){
        System.err.println(store);
    }

    public void undo(){
        Momento m = recordState.undo();
        store = m.getSnapShot();
    }
    
}
