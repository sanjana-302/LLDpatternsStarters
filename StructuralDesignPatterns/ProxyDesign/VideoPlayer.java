package StructuralDesignPatterns.ProxyDesign;
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

public class VideoPlayer implements IVideoPlayer{

    // rate limiter should be separated
    // Map<String,Integer> countPerUser = new HashMap<>();
    // authentication or whitelisting should not be handled by player service 
    // List<String> allowedUsers = new ArrayList<>();

    public VideoPlayer(){
        // allowedUsers.add("Sanjana");
    }

    @Override 
    public void playPremiumVideo(String user){
        // Too much work being performed by video service here 
        // Breaking SRP
        // check if user is allowd to play premium video
        // if(allowedUsers.contains(user)){
        //     System.out.println("Allowed to play premium videos!");
        // }else{
        //     System.out.println("NOT Allowed to play premium videos!");
        //     return;
        // }
        // countPerUser.put(user, countPerUser.getOrDefault(user, 0) + 1);
        // check if this is withim allowed range - 5 is allowed 

        // if(countPerUser.get(user)>5){
        //     System.out.println("NOT Allowed to play premium videos as you have requested to many times!");
        // }else{
        //     System.out.println("Allowed to play premium videos as you are under limit!");
        // }

        // play the video
        System.out.print("Playing video!!");
    }
    
}
