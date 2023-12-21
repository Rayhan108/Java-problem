
import java.util.Scanner;
class BankAcount {

    private String accountnumber;
    private String accountHolder;
    Scanner in = new Scanner(System.in);
    
    private double blance;

    public BankAcount() {
        this.accountnumber = "NULL";
        this.accountHolder = "UNKNOWN";
        this.blance =5000;
    }

    public BankAcount(String accountnumber, String accountHolder, double blance) {

    }

    public void setAccountHolder(String acountHolder) {
        this.accountHolder = acountHolder;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setBlance(double blance) {
        this.blance = blance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && blance >= amount) {

            blance -= amount;
            System.out.println("Widthraw $ :" + amount);
        } else {
            System.out.println("Invalid withdrawl amount ");
        }

    }

    public double checkBalance() {
        return blance;
    }

    public double claculateInterest() {
        return blance * 0.05;
    }

    public void displayAcountInfo() {

        System.out.println("Acount Number:" + accountnumber);
        System.out.println("Account Holder :" + accountHolder);
        System.out.println("Blance $ :" + blance);
        System.out.println("Blance after Interest$:" + claculateInterest());

    }
}

public class Banks {

    public static void main(String[] args) {
        BankAcount b1 = new BankAcount();
        System.out.println("Amount information of person 1:");
        b1.displayAcountInfo();
        BankAcount b2 = new BankAcount();
        b2.displayAcountInfo();
        System.out.println("Blance offer widthrowing:");
        b2.withdraw(2000);
        b2.displayAcountInfo();

    }
}
