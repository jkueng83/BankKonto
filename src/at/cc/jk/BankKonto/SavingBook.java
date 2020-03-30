package at.cc.jk.BankKonto;

public class SavingBook extends Account {
    public SavingBook(double debitInterest, double creditInterest) {
        super(debitInterest, creditInterest, 0.0);
    }
}
