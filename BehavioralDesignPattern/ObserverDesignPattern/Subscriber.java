package BehavioralDesignPattern.ObserverDesignPattern;

public class Subscriber implements IListner{

    @Override
    public void stateChanged(Video v) {
        // get latest video and play it
        System.out.println("Latest video is being played!!");
        v.playVideo();
    }
    
}
