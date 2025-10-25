package InterfacesCommunicationProblemChetan;



public class MainMedia {

    public static void main(String[] args) {

        System.out.println("Welcome to facebook");

        Facebook facebook = new Facebook();

        facebook.friendRequest();
        facebook.imageSharing();
        facebook.videoSharing();
        facebook.like();
        System.out.println();


        System.out.println("Welcome to Instagram");

        Instagram instagram = new Instagram();

        instagram.friendRequest();
        instagram.imageSharing();
        instagram.videoSharing();
        instagram.comments();
        instagram.reels();
        System.out.println();


        System.out.println("LinkedIn");

        LinkedIn linkedIn = new LinkedIn();

        linkedIn.connectionRequest();
        linkedIn.imageSharing();
        linkedIn.textPost();
        linkedIn.like();
        linkedIn.comments();
        System.out.println();


        System.out.println("Welcome to Zoom Workplace");

        Zoom zoom = new Zoom();

        zoom.connectionRequest();
        zoom.chatting();
        zoom.reactions();
        zoom.screenSharing();
        zoom.scheduling();
        System.out.println();


        System.out.println("Welcome to CNN");

        CNN cnn = new CNN();

        cnn.news();
        cnn.weatherForecasting();





    }
}
