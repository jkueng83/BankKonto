package at.cc.jk.BankKonto;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer extends Person {

    private List<Account> accounts;

    public BankCustomer(String name, String birthday) {
        super(name, birthday);
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public double getOverAllDeposit() {
        double overAllDeposit = 0;
        for (int i = 0; i < this.accounts.size(); i++) {
            //this.accounts.get(i).getSaldo();
            overAllDeposit += this.accounts.get(i).getSaldo();
        }
        System.out.println("The over all deposit is: " + overAllDeposit);
        return overAllDeposit;
    }


}
