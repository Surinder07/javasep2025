package ChetanInterfaces;

public class LinkedIn implements ProfessionalMedia{



    @Override
    public void connectionRequest() {
        System.out.println("Send connection request");
    }

    @Override
    public void textPost() {
        System.out.println("Share text post");
    }

    @Override
    public void like() {
        System.out.println("Hit Like");
    }

    @Override
    public void dislike() {

        System.out.println("Hit Dislike");
    }

    @Override
    public void comments() {
        System.out.println("Input comment");
    }

    @Override
    public void imageSharing() {
        System.out.println("Share images");
    }

    @Override
    public void videoSharing() {
        System.out.println("Share videos");
    }
}
