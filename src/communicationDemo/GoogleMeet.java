package communicationDemo;

public class GoogleMeet implements InternalProfessionalMedia{
    @Override
    public void meetings() {
        System.out.println("you can do meetings");
    }

    @Override
    public void chat() {
        System.out.println("you can do chatting");
    }

    @Override
    public void recording() {
        System.out.println("you can do recording");
    }
}
