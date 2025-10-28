package Medias;

public class MediasCanDo implements Media{

    @Override
    public void passingInformation() {
        System.out.println("Medias pass information from person to person");
    }

    @Override
    public void videography() {
        System.out.println(" All media can do videography");
    }

    @Override
    public void recording() {
        System.out.println("Medias record");
    }

    @Override
    public void sharing() {
        System.out.println("Media shares information");
    }

    @Override
    public void speaking() {
        System.out.println("Media have speakers");

    }
}
