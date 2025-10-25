package communicationDemo;

public class Zoom implements InternalProfessionalMedia{
    @Override
    public void meetings() {
        System.out.println("you can do meetings");
    }

    @Override
    public void chat() {
        System.out.println("you can do chatting with people");
    }

    @Override
    public void recording() {
        System.out.println("you can do recording");
    }
}
