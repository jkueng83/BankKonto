package at.cc.jk.BankKonto;

public class BankWorker extends Person {

    private String department ;
    public BankWorker(String name, String birthday , String department) {
        super(name, birthday);
        this.department = department ;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void printBankWorkerDetails(){
        printPersonDetails();
        System.out.println("Department:\t\t\t" + this.department);
    }
}
