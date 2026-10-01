package BehavioralDesignPattern.iteratorDesign;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Music m1 = new Music(new MusicIterator());
        m1.setName("Bollywood");
        Music m2 = new Music(new MusicIterator());
        m2.setName("hollywood");
        List<Iterable> collection = new ArrayList<>();
        collection.add(m1);
        collection.add(m2);
        MusicIterator it = new MusicIterator();
        System.out.println("Do we have more songs : " + it.hasNext(m1, collection));
        System.out.println("Name of next item " + it.next(m1, collection));
        
    }
}
