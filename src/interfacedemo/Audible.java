package interfacedemo;

public class Audible extends AudioBook implements AudioMediaPlayer,Payable,MediaPlayer{

    public void playAudioBooks(){
        System.out.println("Playing AudioBooks");
    }

    public void playPodcasts(){
        System.out.println("Playing Podcasts");
    }

    @Override
    public void play() {

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
}
