package Nov01;

public class OnlineWebApp {


    public void Register(String email) throws InvalidEmailLengthException {
        if (email.length() < 4){
            throw new InvalidEmailLengthException("Invalid email exception !");
        }
    }

    public void emailConfirmation(String email,String username) throws InvalidEmailLengthException {
        Register(email);
        System.out.println("Email notification Sent ...");
    }

    public void login(String email, String username) throws InvalidEmailLengthException {

        if(username.equals(email))
        // if (email.length() < 5)
        {
            throw new InvalidCredentialsException("Invalid Credentials exception ...");
        }
        emailConfirmation(email,username);
        System.out.println("User is able to login ...");
    }

    public void Shop(String email,String username) throws InvalidEmailLengthException {
        login(email,username);
        System.out.println("Find item to shop and checkout");
    }

    public void Payment(String email,String username) throws InvalidEmailLengthException
    {
        Shop(email,username);
        System.out.println("Make Payment");
    }

    public void ecom(String email,String username) throws InvalidEmailLengthException
    {
        try{
      Payment(email,username);}
        catch (InvalidEmailLengthException e)
        {
            e.printStackTrace();
        }
    }

}
