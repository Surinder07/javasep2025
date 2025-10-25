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
        System.out.println("Here are the features available for youtube");
        Youtube youtube = new Youtube();
        youtube.play();
        youtube.pause();
        youtube.videoSpeed();
        youtube.fastForward();

        // Amazon Prime Video
        System.out.println("Here are the features available for Amazon prime");
        AmazonPrimeVideo amazonPrimeVideo = new AmazonPrimeVideo();
        amazonPrimeVideo.play();
        amazonPrimeVideo.pause();
        amazonPrimeVideo.videoSpeed();
        amazonPrimeVideo.rewind();

        // Hotstar
        System.out.println("Here are the features available for Hotstar");
       Hotstar hotstar = new Hotstar();
       hotstar.play();
       hotstar.pause();
       hotstar.videoSpeed();
       hotstar.fastForward();

        // Spotify
        Spotify spotify = new Spotify();
        spotify.play();
        spotify.pause();
        spotify.playAudioBooks();
        spotify.pause();

        // Audible
        Audible audible = new Audible();
        audible.play();
        audible.playAudioBooks();
        audible.playPodcasts();
        audible.downloadFeature();
        audible.payment();

    }
}
