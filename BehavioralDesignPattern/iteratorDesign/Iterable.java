package BehavioralDesignPattern.iteratorDesign;

public abstract class Iterable {
    private Iterator i;
    public Iterable(Iterator i){
        this.i = i;
    }
}
