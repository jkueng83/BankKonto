package at.cc.jk.BankKonto;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer extends Person {

    private List<Account> accounts;
    private List<BankWorker> bankWorkers;

    public BankCustomer(String name, String birthday) {
        super(name, birthday);
        this.accounts = new ArrayList<>();
        this.bankWorkers = new ArrayList<>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void addBankWorker(BankWorker bankWorker) {
        this.bankWorkers.add(bankWorker);
    }

    public double getOverAllDeposit() {
        double overAllDeposit = 0;
        for (int i = 0; i < this.accounts.size(); i++) {
            //this.accounts.get(i).getSaldo();
            overAllDeposit += this.accounts.get(i).getSaldo();
        }
        //System.out.println("The over all deposit is: " + overAllDeposit);
        return overAllDeposit;
    }

    public void printOverAllDeposit (){
        System.out.println("Over all deposit:\t" + getOverAllDeposit() + " €");
    }

    public void printBankCustomerDetails() {
        System.out.println("###############################");
        System.out.println("#### Bank customer details ####");
        System.out.println("###############################");

        this.printPersonDetails();

        for (int i = 0; i < this.bankWorkers.size(); i++) {
            System.out.println("------ Bank worker " + (i + 1) + " ------");
            this.bankWorkers.get(i).printBankWorkerDetails();
        }

        for (int i = 0; i < this.accounts.size(); i++) {
            System.out.println("------ Account " + (i + 1) + " ------");
            this.accounts.get(i).printAccountDetails();
        }

        System.out.println("------------------------------");
        printOverAllDeposit();
    }


}
