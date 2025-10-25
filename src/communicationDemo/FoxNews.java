package communicationDemo;

public class FoxNews implements TraditionalMedia{
    @Override
    public void readNews() {
System.out.println("you can read news");
    }

    @Override
    public void getUpdates() {
        System.out.println("you can get updates");
    }
}
