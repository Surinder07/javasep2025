package Medias;

public class Tiktok extends MediasCanDo implements PersonalMedia{


    @Override
    public void meetings() {
        System.out.println("Organising online group meetings; Online group meeting is part of social media");

    }

    @Override
    public void videoCalling() {
        System.out.println("Tiktok can video call because it's a social media");

    }

    @Override
    public void streaming() {
        System.out.println("SocialMedia can stream");

    }

    @Override
    public void requestingFriends() {
        System.out.println("Social media can send and receive friend request");

    }

    @Override
    public void chatting() {
        System.out.println("Can chat with clients because I am social media");

    }

}
