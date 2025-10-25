package communicationDemo;

public class LinkedIn implements ProfessionalMedia{
    @Override
    public void getProfessionalInfo() {
        System.out.println("You can get professional information");
    }

    @Override
    public void careerNetworking() {
        System.out.println("You can do career networking");
    }

    @Override
    public void chat() {
        System.out.println("You can do chat");
    }

    @Override
    public void comment() {
        System.out.println("You can do comment");
    }

    @Override
    public void like() {
        System.out.println("You can do like");
    }

    @Override
    public void sharePost() {
        System.out.println("You can do share post");
    }
}
