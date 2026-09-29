package BehavioralDesignPattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.HashSet;

// one to many 

public class main {
    public static void main(String[] args) {
// 1. Initialize the YouTube Channel with a Subscriber Set and Video List
        YouTubeChannel channel = new YouTubeChannel(new HashSet<>(), new ArrayList<>());

        // 2. Create Subscribers (Observers)
        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();

        // 3. Register subscribers to the channel
        channel.addListner(sub1);
        channel.addListner(sub2);

        System.out.println("--- Uploading New Video ---");
        // 4. Create a new video and add it to the channel
        Video newVideo = new Video("Video on foood in Italy!!");
        System.out.println("\n--- Notifying all subscribers ---");

        channel.addVideo(newVideo);

    }
}
