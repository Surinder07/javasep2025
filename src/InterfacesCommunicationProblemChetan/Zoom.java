package InterfacesCommunicationProblemChetan;

public class Zoom implements InternalProfessionalMedia{


    public void reactions(){
        System.out.println("input Reactions");

    }

    @Override
    public void meetings() {
        System.out.println("in meeting");
    }

    @Override
    public void scheduling() {
        System.out.println("Schedule Meetings");
    }

    @Override
    public void chatting() {
        System.out.println("Enter to the chat");
    }

    @Override
    public void screenSharing() {
        System.out.println("Share your screen");
    }

    @Override
    public void connectionRequest() {
        System.out.println("Meeting Request");
    }

    @Override
    public void textPost() {

    }

    @Override
    public void like() {

    }

    @Override
    public void dislike() {

    }

    @Override
    public void comments() {

    }

    @Override
    public void imageSharing() {

    }

    @Override
    public void videoSharing() {

    }
}
