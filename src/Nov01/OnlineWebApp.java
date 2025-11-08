package Nov01;

public class OnlineWebApp {


    public void Register(String email, String Phone) throws InvalidEmailLengthException {
        if (email.length() < 4){
            throw new InvalidEmailLengthException("Invalid email exception !");
        }

        if (Phone.length() != 10) {
            throw new InvalidPhoneNumberException("Invalid Phone number exception !");
        }else
        {
            System.out.println("Your Phone number is : " +Phone);
        }
    }

    public void emailConfirmation(String email,String username,String Phone) throws InvalidEmailLengthException {
        Register(email,Phone);
        System.out.println("Email notification Sent ...");
    }

    public void login(String email, String username,String Phone) throws InvalidEmailLengthException {

        if(username.equals(email))
        // if (email.length() < 5)
        {
            throw new InvalidCredentialsException("Invalid Credentials exception ...");
        }
        emailConfirmation(email,username,Phone);
        System.out.println("User is able to login ...");
    }

    public void Shop(String email,String username,String Phone) throws InvalidEmailLengthException {
        login(email,username,Phone);
        System.out.println("Find item to shop and checkout");
    }

    public void Payment(String email,String username,String Phone,PaymentMethod paymentMethod) throws InvalidEmailLengthException
    {
        Shop(email,username,Phone);
        System.out.println("Make Payment");
    }

    public void ecomApp(String email,String username, String Phone, PaymentMethod paymentMethod) throws InvalidEmailLengthException
    {
        try{
      Payment(email,username,Phone, paymentMethod);}
        catch (InvalidEmailLengthException e)
        {
            e.printStackTrace();
        }
    }

}
