package BehavioralDesignPattern.ObserverDesignPattern;

import java.util.List;
import java.util.Set;

public class YouTubeChannel implements IObserver{

    Set<IListner> subscriberList;
    List<Video> currentAvailableVideos;

    public YouTubeChannel(Set<IListner> subscriberList,List<Video> currentAvailableVideos){
        this.subscriberList = subscriberList;
        this.currentAvailableVideos = currentAvailableVideos;
    }


    public void addVideo(Video v){
        System.out.println("Current videos on this channel " + currentAvailableVideos.size());
        currentAvailableVideos.add(v);
        System.out.println("Current videos on this channel after adding "+ v.name + " to channel " + currentAvailableVideos.size());
        notifyListners();
    }

    public Video getLatestVideo(){
        int size = currentAvailableVideos.size();
        return this.currentAvailableVideos.get(size-1);
    }

    @Override
    public void addListner(IListner l) {
        subscriberList.add(l);
    }

    @Override
    public void removeListner(IListner l) {
        subscriberList.remove(l);
    }

    @Override
    public  void notifyListners() {
        for(IListner subscriber: subscriberList){
            // when passing this here, I cannot call getLatestVideo() in Subscriber class
            subscriber.stateChanged(this.getLatestVideo());
        }
    }
    
}
