package communicationDemo;

public class MainCommunication {
    public static void main(String[] args) {
        FoxNews foxNews = new FoxNews();
        System.out.println("Welcome to Fox News");
        foxNews.readNews();
        foxNews.getUpdates();

        GoogleMeet googleMeet = new GoogleMeet();
        System.out.println("Welcome to Google Meet");
        googleMeet.recording();
        googleMeet.meetings();
        googleMeet.chat();

        Zoom zoom = new Zoom();
        System.out.println("Welcome to Zoom");
        zoom.recording();
        zoom.chat();
        zoom.meetings();

        LinkedIn linkedIn = new LinkedIn();
        System.out.println("Welcome to LinkedIn");
        linkedIn.careerNetworking();
        linkedIn.getProfessionalInfo();
        linkedIn.chat();
        linkedIn.comment();
        linkedIn.sharePost();
        linkedIn.like();

        Facebook facebook = new Facebook();
        System.out.println("Welcome to Facebook");
        facebook.chat();
        facebook.watchReels();
        facebook.postPhoto();
        facebook.getUpdates();
        facebook.connectPeople();

        Instagram instagram = new Instagram();
        System.out.println("Welcome to Instagram");
        instagram.chat();
        instagram.watchReels();
        instagram.postPhoto();
        instagram.getUpdates();
        instagram.connectPeople();

    }
}
