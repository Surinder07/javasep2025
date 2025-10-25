package InterfacesCommunicationProblemChetan;

public class CNN implements TraditionalMedia{
    @Override
    public void imageSharing() {
        System.out.println("Share images");
    }

    @Override
    public void videoSharing() {
        System.out.println("Share videos");
    }

    @Override
    public void news() {
        System.out.println("Running News");
    }

    @Override
    public void weatherForecasting() {
        System.out.println("Weather forecasting in progress");
    }
}
