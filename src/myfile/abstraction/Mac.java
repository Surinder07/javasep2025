package myfile.abstraction;

public class Mac extends  Computer{

    public void canConnectToInternet() {
        System.out.println("surfing the net..");
    }

    @Override
    public void canInstallSoftware() {
        System.out.println("installing dmg files ");
    }

    @Override
    public void canType() {
        System.out.println("processing typing..");
    }

    @Override
    public void canMakeCallsNow() {
        System.out.println("Calling through iphone");
    }
}
