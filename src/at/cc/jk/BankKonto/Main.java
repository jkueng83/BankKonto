package at.cc.jk.BankKonto;
/*
Aufgabe - Konto
-----------------------
Wir müssen für eine Bank ein Programm schreiben welches Aktivitäten im Zusammenhang mit dem Konto abhandeln kann.

Unsere Bank hat folgende Konten im Angebot:

Sparbuch
Girokonto
LändleGirokonto
Kreditkonto

Wir möchten einzahlen, auszahlen können, aber auch den Saldo am Konto erfahren. Je Art von Konto gibt es noch eigene
Eigenschaften. (z.B. Zinssatz, Überziehungsrahmen, …)


 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Bank Kontos");

        BankCustomer bankCustomer = new BankCustomer("Johannes" ,"3.9.1983");

        CreditAccount creditAccount = new CreditAccount(2,1,-200000);
        LaendleGiroAccount laendleGiroAccount = new LaendleGiroAccount(8,0.5,5000);
        SavingBook savingBook =new SavingBook(4,2);

        bankCustomer.addAccount(creditAccount);
        bankCustomer.addAccount(laendleGiroAccount);
        bankCustomer.addAccount(savingBook);

        bankCustomer.getOverAllDeposit();

        creditAccount.payOut(200000);
        bankCustomer.getOverAllDeposit();

        laendleGiroAccount.payIn(1500.0);
        savingBook.payIn(12256.42);
        bankCustomer.getOverAllDeposit();

        System.out.println(bankCustomer.getName());
        System.out.println(bankCustomer.getBirthday());
    }



}
