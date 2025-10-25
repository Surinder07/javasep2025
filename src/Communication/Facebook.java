package Communication;

public class Facebook implements SocialMedia {

    @Override
    public void search(String name) {
        System.out.println("please type the name to search");

    }

    @Override
    public void findfriends(String name) {
        System.out.println("Search for the friends by typing name");

    }

    @Override
    public void chat() {
        System.out.println("messenger can be used to chat");

    }
}
