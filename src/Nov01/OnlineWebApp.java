package Nov01;

public class OnlineWebApp {


    public void Register() {
        System.out.println("Registration Successful ...");

    }

    public void emailConfirmation() {
        Register();
        System.out.println("Email notification Sent ...");
    }

    public void login() {

        emailConfirmation();
        System.out.println("User is able to login ...");
    }

    public void Shop()
    {
        login();
        System.out.println("Find item to shop and checkout");
    }

    public void Payment()
    {
        Shop();
        System.out.println("Make Payment");
    }

    public void ecom()
    {
      Payment();
    }

}
