package communicationDemo;

public class CnnNews implements TraditionalMedia{
    @Override
    public void readNews() {
        System.out.println("you can read News");
    }

    @Override
    public void getUpdates() {
        System.out.println("you can get the updates");
    }
}
