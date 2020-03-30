package at.cc.jk.BankKonto;

public class GiroAccount extends Account {

    public GiroAccount(double debitInterest, double creditInterest, double minimumBalance) {
        super(debitInterest, creditInterest, minimumBalance);
        super.accountName = "Giro Account";
    }
}
