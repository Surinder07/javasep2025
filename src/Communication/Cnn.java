package Communication;

public class Cnn implements TraditionalMedia {
    @Override
    public void currentAffairs() {
        System.out.println("you can know about the current affairs");

    }

    @Override
    public void news() {
        System.out.println("watch the news");

    }

    @Override
    public void forecast() {
        System.out.println("can see about the weather");

    }
}
