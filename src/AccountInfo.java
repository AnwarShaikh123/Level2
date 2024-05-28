
import java.util.Scanner;

class AccountInfo {
    double balance;
    int accountNumber;
    static int amount;
    static int withdrawAmt;
    Scanner sc = new Scanner(System.in);

    public AccountInfo(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        System.out.println("Enter the Amt:");
        amount = sc.nextDouble();

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit:" + amount);
            System.out.println("balance: " + balance);
        }
    }

    public void withdraw(double withdrawAmt) {
        System.out.println("Enter the withdrawAmt:");
        withdrawAmt = sc.nextDouble();
        if (withdrawAmt < balance && withdrawAmt > 0) {
            balance -= withdrawAmt;
            System.out.println("withdraw is:" + withdrawAmt);
            System.out.println("balance is" + balance);
        }

    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static void main(String[] args) {
        AccountInfo bk = new AccountInfo(20000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  account number:");
        int accountNumber = sc.nextInt();
        bk.setAccountNumber(accountNumber);
        System.out.println("Enter the option 1: Deposit option 2: withdraw");
        int option = sc.nextInt();

        switch (option) {
            case 1: {
                bk.deposit(amount);
            }
            case 2: {
                bk.withdraw(withdrawAmt);
            }

        }
    }
}




