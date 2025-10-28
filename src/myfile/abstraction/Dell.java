package myfile.abstraction;

public class Dell extends  Computer{
    @Override
    public void canConnectToInternet() {
        System.out.println("searching the net..");
    }

    @Override
    public void canInstallSoftware() {
        System.out.println("installing plugins");
    }

    @Override
    public void canType() {
        System.out.println("process typing..");
    }

    @Override
    public void canMakeCallsNow() {
        System.out.println("Calling through Samsung");
    }
}
