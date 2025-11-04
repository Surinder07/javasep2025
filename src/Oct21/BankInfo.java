package Oct21;

public class BankInfo {

    public static void main (String[] args)
    {
        BankOfCanada bankOfCanadaSC = new Scotia();
        BankOfCanada bankOfCanadaTD = new TD();
        BankOfCanada bankOfCanadaPG = new PragraBank();
        System.out.println("The total interest for Scotia Bank will be : " + bankOfCanadaSC.rateOfInterest());
        System.out.println("The total interest for TD Bank will be : " + bankOfCanadaTD.rateOfInterest());
        System.out.println("The total interest for Pragra Bank will be :" + bankOfCanadaPG.rateOfInterest());
    }
}
