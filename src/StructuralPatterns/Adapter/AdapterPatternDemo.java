package StructuralPatterns.Adapter;

public class AdapterPatternDemo {
    public static void main (String[] args) {
        AudioPlayer audioplayer = new AudioPlayer(); //only 1 audio player is required to play all, uses two different interfaces 

        audioplayer.play("mp3", "yeet.mp3");
        audioplayer.play("mp4", "file.mp4");
        audioplayer.play("vlc", "thing.vlc");
        audioplayer.play("avi", "thing2.avi");
    }
}
