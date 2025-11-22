public class Bank {

    double balance;


    public Bank(double balance) {
        this.balance = balance;
    }

    public double getBalance() {

        return balance;
    }

    public double withdraw(double amount) {
        if (balance < amount) {
       //     throw new InsuffiencientBalance("Insufficient Balance");
        }
        balance = balance - amount;
        return balance;
    }

    public double deposit(double amount)
    {
        balance = balance + amount;
        return balance;
    }
}


