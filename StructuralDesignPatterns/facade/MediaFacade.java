package StructuralDesignPatterns.facade;

public class MediaFacade {

    MusicPlayerSubsystem musicPlayerSubsystem;
    AudioBookPlayerSubsystem audioBookPlayerSubsystem;
    VideoPlayerSubsystem videoPlayerSubsystem;

    public MediaFacade(){
        this.audioBookPlayerSubsystem = new AudioBookPlayerSubsystem();
        this.musicPlayerSubsystem = new MusicPlayerSubsystem();
        this.videoPlayerSubsystem = new VideoPlayerSubsystem();
    }

    public void performAction(String action){
        switch (action) {
            // this goes on and on and on
            // but my client only knows action
            case "playVideo":
                videoPlayerSubsystem.playVideo();
                break;
            case "playAudioBook":
                audioBookPlayerSubsystem.pauseAudioBook();
                break;
            case "playMusic90s":
                musicPlayerSubsystem.playMusicFrom90s();
            default:
                break;
        } 
    }
}
