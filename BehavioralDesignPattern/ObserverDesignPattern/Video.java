package BehavioralDesignPattern.ObserverDesignPattern;

import java.util.Date;

/**
 * Video
 */
public class Video {

    public String name;
    public Date timeStamp;

    public Video(String name){
        this.name = name;
    }

    void playVideo(){
        System.out.println("Playing video " + name);
    }

}
