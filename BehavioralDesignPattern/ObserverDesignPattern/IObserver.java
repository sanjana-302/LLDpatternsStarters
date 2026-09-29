package BehavioralDesignPattern.ObserverDesignPattern;

public interface IObserver {
    public void addListner(IListner l);
    public void removeListner(IListner l);
    public void notifyListners();
}
