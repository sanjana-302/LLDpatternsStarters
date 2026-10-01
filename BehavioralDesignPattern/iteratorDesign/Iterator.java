package BehavioralDesignPattern.iteratorDesign;

import java.util.List;

public interface Iterator {
    public Boolean hasNext(Iterable m,List<Iterable> collection);
    public Iterable next(Iterable m,List<Iterable> collection);
}
