package Medias;

public class Linkedln extends MediasCanDo implements ProfessionalMedia {
    @Override
    public void jobLinking() {
        System.out.println("Job hunting because I am a professional medai");

    }

    @Override
    public void contracting() {
        System.out.println("Contracting because I am a professional media");
    }

    @Override
    public void chatting() {
        System.out.println("Can chat with clients because I am social media");

    }

    @Override
    public void meetings() {
        System.out.println("Organising online group meetings; Online group meeting is part of social media");

    }
}
