package at.cc.jk.BankKonto;

public class Account
{
    protected String accountName = "default";
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

    public double getSaldo() {
        return this.balance;
    }

    public void printAccountSaldo() {
        System.out.println("Account name:\t\t" + this.accountName );
        System.out.println("Saldo:\t\t\t\t" + this.balance + " €");
    }

    public void printAccountDetails() {
        printAccountSaldo();
        System.out.println("Debit Interset:\t\t" + this.debitInterest + " %");//Sollzinsen -
        System.out.println("Credit Interset:\t" + this.creditInterest + " %"); // Haben Zinsen +
        System.out.println("Minimum balance:\t" + this.minimumBalance + " €");
    }

}
