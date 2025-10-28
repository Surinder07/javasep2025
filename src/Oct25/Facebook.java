package Oct25;

public class Facebook extends MainMedia implements InternalProfessionalMedia{
    @Override
    public void Teams() {
        System.out.println("1. Teams");;
    }

    @Override
    public void Slack() {
        System.out.println("2. Slack");
    }

    @Override
    public void Zoom() {
        System.out.println("3. Zoom");
    }

    @Override
    public void Meet() {
        System.out.println("4. Meet");

    }
}
