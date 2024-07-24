import java.util.Scanner;

public class ATM_Machine{

    public static void main(String[] args) {
        Account a =  new Account();
        Scanner b =  new Scanner(System.in);
        while(true){
            System.out.println("Please select an below option: " +
                    "\n 1. Withdraw Amount" +
                    "\n 2. Deposit Amount" +
                    "\n 3. Check Balance" +
                    "\n 4. Exit");
            int choice = b.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the Withdraw amount: ");
                    int amount = b.nextInt();
                    a.withdraw(amount);
                    break;
                case 2:
                    System.out.println("Enter the Deposit amount: ");
                    int amount1 = b.nextInt();
                    a.deposit(amount1);
                    break;
                case 3:
                    a.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using ATM!");
                    b.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

    }
}

class Account extends userBankAccount{
    public  void withdraw(int amount) {
        if (getAccounBalance() > amount){
            withdrawAmount(amount);
            System.out.println(amount + " Rs. is Successfully Withdraw \n");
        }else {
            System.out.println("oops! Insufficient Balance \n");
        }
    }

    public void deposit(int amount) {
        depositAmount(amount);
        System.out.println(amount + " Rs. is successfully Deposit \n");
    }

    public void checkBalance(){
        System.out.println("Your Account Balance is " + getAccounBalance() + " Rs. \n");
    }
}

class userBankAccount{
    private  Double accounBalance = 0.0;

    protected  Double getAccounBalance() {
        return accounBalance;
    }

    protected void depositAmount(int amount) {
        this.accounBalance += amount;
    }

    protected void withdrawAmount(int amount) {
        this.accounBalance -= amount;
    }
 }