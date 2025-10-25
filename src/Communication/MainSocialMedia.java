package Communication;

public class MainSocialMedia {
    public static void main(String[] args) {
        System.out.println("Welcome to the Facebook ");

        Facebook facebook = new Facebook();
        facebook.chat();
        facebook.findfriends("Chetan");
        facebook.search("Lovepreet");
        System.out.println();

        System.out.println("Welcome to the Instagram");

        Instagram instagram = new Instagram();
        instagram.chat();
        instagram.findfriends("Edafe");
        instagram.shareImages();
        instagram.watchReels();
        System.out.println();

        System.out.println("Welcome to the Snapchat");
        Snapchat snapchat = new Snapchat();
        snapchat.filters();
        snapchat.Streaks();
        System.out.println();

        System.out.println("Welcome to the Professional Media");
        System.out.println();

        System.out.println("Welcome to the LinkedIn");
        LinkedIn linkedIn = new LinkedIn();
        linkedIn.buildResume();
        linkedIn.searchJobs();
        System.out.println();

        System.out.println("Welcome to the Traditional Forecast");
        System.out.println("Currently You are watching CNN");
        Cnn cnn = new Cnn();
        cnn.currentAffairs();
        cnn.news();
        cnn.forecast();
        System.out.println();
    }
}
