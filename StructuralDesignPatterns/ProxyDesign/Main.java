package StructuralDesignPatterns.ProxyDesign;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> userTrying = new ArrayList<>();
        userTrying.add("Sanjana");
        userTrying.add("Aneesh");

        IVideoPlayer proxyPlayer = new ProxyVideoPlayer();

        for(String user: userTrying){
            proxyPlayer.playPremiumVideo(user);
        }
        proxyPlayer.playPremiumVideo("Sanjana");
        proxyPlayer.playPremiumVideo("Sanjana");
        proxyPlayer.playPremiumVideo("Sanjana");
        proxyPlayer.playPremiumVideo("Sanjana");
        proxyPlayer.playPremiumVideo("Sanjana");
        proxyPlayer.playPremiumVideo("Sanjana");
    }
}
