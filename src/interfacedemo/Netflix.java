package interfacedemo;

public class Netflix implements MediaPlayer, VideoMediaPlayer, Streaming, Payable{
    @Override
    public void play() {
        System.out.println("you can play videos on netflix.");
    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void rewind() {

    }

    @Override
    public void fastForward() {

    }

    @Override
    public void payment() {

    }

    @Override
    public void downloadFeature() {

    }

    @Override
    public void streamable() {

    }

    @Override
    public void liveStreaming() {
        System.out.println("Unfortunatly, it does not support in your region");
    }

    @Override
    public void videoSpeed() {

    }

    @Override
    public double resolution() {
        return 0;
    }
}
