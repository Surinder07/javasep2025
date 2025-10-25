package InterfacesCommunicationProblemChetan;

public class Instagram implements SocialMedia{

    public void reels(){


    }


    @Override
    public void friendRequest() {
        System.out.println("Send Friend Request");
    }

    @Override
    public void textPost() {
        System.out.println("Share Text");
    }

    @Override
    public void like() {
        System.out.println("Hit like");
    }

    @Override
    public void dislike() {
        System.out.println("Hit Dislike");
    }

    @Override
    public void comments() {
        System.out.println("Input Comments");
    }

    @Override
    public void imageSharing() {
        System.out.println("Share images");
    }

    @Override
    public void videoSharing() {
        System.out.println("Share Videos");
    }
}
