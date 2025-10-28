package myfile.abstraction;

public class HP extends  Computer{
    @Override
    public void canConnectToInternet() {
        System.out.println("Connecting to internet activated");
    }

    @Override
    public void canInstallSoftware() {
        System.out.println("windows installing....");
    }

    @Override
    public void canType() {
        System.out.println("Typing....");

    }

    @Override
    public void canMakeCallsNow() {
        System.out.println("establishing connection via lumia.");
    }

}
