package BehavioralDesignPattern.mementoPattern;

import java.util.ArrayDeque;
import java.util.Deque;

public class Caretaker {
    private Deque<Momento> snapShot;

    public Caretaker(){
        this.snapShot = new ArrayDeque<>();
    }

    public void addToState(Momento m){
        snapShot.push(m);
    }

    public Momento getState(){
        return snapShot.peek();
    }

    public Momento undo(){
         // remove state from queue
        return snapShot.pop();
    }
}
