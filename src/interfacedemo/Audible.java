package interfacedemo;

public class Audible extends AudioBook implements Payable, Streaming{
    @Override
    public void payment() {
        System.out.println("Payment is required to use this services");

    }

    @Override
    public void downloadFeature() {
        System.out.println("You can only download HD Videos if subscribed");

    }

    @Override
    public void playAudioBooks() {
        super.playAudioBooks();
    }

    @Override
    public void play() {
        super.play();
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void rewind() {
        super.rewind();
    }

    @Override
    public void fastForward() {
        super.fastForward();
    }

    @Override
    public void streamable() {

    }

    @Override
    public void liveStreaming() {

    }
}
