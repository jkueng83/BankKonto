package at.cc.jk.BankKonto;

public class Account
{
    private double balance;
    private double debitInterest; //Sollzinsen -
    private double creditInterest; // Haben Zinsen +
    private double minimumBalance;

    public Account(double debitInterest, double creditInterest, double minimumBalance) {
        this.debitInterest = debitInterest;
        this.creditInterest = creditInterest;
        this.minimumBalance = minimumBalance;
    }

    public void payIn(double amount) {
        double newBalance = this.balance + amount;

        this.balance = newBalance;
    }

    public double payOut(double amount) {
        if (this.balance - amount >= this.minimumBalance) {
            this.balance -= amount;
        } else {
            System.out.println("Behebung nicht möglich, Betrag zu hoch");
        }
        return this.balance;
    }

    public double getSaldo (){
        return this.balance;
    }

}
