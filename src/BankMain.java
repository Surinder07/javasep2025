public class BankMain {

    public static void main (String[] args)
    {
        Bank bank = new Bank(1000);
        System.out.println("Pragra Bank");
        System.out.println("Current Balance :" +bank.getBalance());
        System.out.println("Balance after deposit 18923 : " +bank.deposit(18923));
        try{
            System.out.println("Balance after withdraw 500 : " + bank.withdraw(30500));
        } catch (RuntimeException ex)
        {
            ex.printStackTrace();
        }

    }
}
