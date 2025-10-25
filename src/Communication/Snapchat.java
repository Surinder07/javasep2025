package Communication;

public class Snapchat implements SocialMedia {
    void Streaks(){
        System.out.println("can be used to create streaks with friends");
    }
    void filters(){
        System.out.println("you can search different type of filters");
    }

    @Override
    public void search(String name) {

    }

    @Override
    public void findfriends(String name) {

    }

    @Override
    public void chat() {

    }
}
