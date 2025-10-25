package communicationDemo;

public class Facebook implements SocialMedia {
    @Override
    public void connectPeople() {
        System.out.println("You can connect with people");
    }

    @Override
    public void chat() {
        System.out.println("You can do chatting with your friends");
    }

    @Override
    public void watchReels() {
        System.out.println("You can watch reels");
    }

    @Override
    public void postPhoto() {
        System.out.println("You can post photo on your profile");
    }

    @Override
    public void readNews() {
        System.out.println("You can read news");
    }

    @Override
    public void getUpdates() {
        System.out.println("You can get new updates");
    }
}
