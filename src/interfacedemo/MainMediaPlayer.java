package interfacedemo;

public class MainMediaPlayer {
    public static void main(String[] args) {
        // netflix
        System.out.println("Welcome to My Streaming Services");
        System.out.println("If you want to download, please select the service with payment option");

        Netflix netflix = new Netflix();
        System.out.println("Here are the features available for netflix");
        netflix.play();
        netflix.pause();
        netflix.videoSpeed();
        netflix.downloadFeature();
        netflix.liveStreaming();
        netflix.resolution();
        netflix.streamable();

        // Youtube Music


        // Amazon Prime Video



        // Hotstar


        // Spotify


        // Audible 

    }
}
