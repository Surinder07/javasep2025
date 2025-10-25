package communicationDemo;

public class WhatsApp implements SocialMedia{
    @Override
    public void connectPeople() {
        System.out.println("you can connect with people");
    }

    @Override
    public void chat() {
        System.out.println("you can do chat with people");
    }

    @Override
    public void watchReels() {
        System.out.println("you can watch reels");
    }

    @Override
    public void postPhoto() {
        System.out.println("you can post photo");
    }

    @Override
    public void readNews() {
        System.out.println("you can read news");
    }

    @Override
    public void getUpdates() {
        System.out.println("you can get updates");
    }
}
