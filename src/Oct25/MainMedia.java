package Oct25;

public class MainMedia {


        public static void main(String[] args) {
            // Facebook
            System.out.println("Welcome to Facebook ");
            Facebook facebook = new Facebook();
            System.out.println("Below are it's features : ");
            facebook.Teams();
            facebook.Meet();
            facebook.Slack();
            facebook.Zoom();

            // Instagram
           System.out.println("Welcome to Instagram ");
            Instagram instagram = new Instagram();
            System.out.println("Below are it's features : ");
            instagram.Teams();
            instagram.Meet();
            instagram.Slack();
            instagram.Zoom();
        }
}


