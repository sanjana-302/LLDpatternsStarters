package BehavioralDesignPattern.iteratorDesign;

import java.util.List;

public class MusicIterator implements Iterator{

    private Iterable cachedVal = null;

    @Override
    public Boolean hasNext(Iterable m,List<Iterable> collection) {
        Boolean hasNext = false;
        for(Iterable mCurr: collection){
            if(hasNext){
                this.cachedVal = mCurr;
                return hasNext;
            }
            if(mCurr==m){
                hasNext = true;
            }
        }

        return hasNext;
    }

    @Override
    public Iterable next(Iterable m,List<Iterable> collection) {
        return cachedVal;
    }
    
}
