package StructuralDesignPatterns.facade;

public class Main {
    public static void main(String[] args) {
        String triggerSubsystem = "video";
        String performAction = "playVideo";

        // Bad way 
        if(triggerSubsystem.equals("video") && performAction.equals("playVideo")){
            System.out.println("Reached here!");
            VideoPlayerSubsystem vc = new VideoPlayerSubsystem();
            vc.playVideo();

            System.out.println("Taking exit!");
        }else if(triggerSubsystem=="video" && performAction=="stop"){
            VideoPlayerSubsystem vc = new VideoPlayerSubsystem();
            vc.stopVideo();
        }else if(triggerSubsystem=="audioBook" && performAction=="play"){
            // so on .. 
        }

        // Good way
        String action = "playVideo"; 
        MediaFacade mf = new MediaFacade();
        mf.performAction(action);
    }
}
