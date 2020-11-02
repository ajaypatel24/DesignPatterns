package StructuralPatterns.Adapter;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String filename) { //plays mp3, uses first interface MediaPlayer
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file, Name :" + filename);
        }

        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) { //adapter portion, chooses the right method to run, uses another interface AdvancedMediaPlayer
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);
        }

        else {
            System.out.println("Invalid media " + audioType + " format not supported");
        }

    }
    
}
