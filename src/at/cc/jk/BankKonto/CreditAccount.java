package at.cc.jk.BankKonto;

public class CreditAccount extends Account {

    public CreditAccount(double debitInterest, double creditInterest, double minimumBalance) {
        super(debitInterest, creditInterest, minimumBalance);
    }
}
