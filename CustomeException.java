import java.util.Scanner;

class NotThatMuchMoney extends Exception
{
    NotThatMuchMoney(String str){
        System.out.println(str);
    }
}
class Bank {
    private  int balance;
    public Bank(int balance){
        this.balance=balance;
    }


     public void amount(int amount) throws NotThatMuchMoney {

        if (amount > balance ) {
            throw new NotThatMuchMoney("There is not that much money");
        } else if (balance < amount) {
            System.out.println("Transaction Completed");

        }
        balance -=amount;
        System.out.println("Withdrawal successful. Remaining balance: "+balance);
    }
}

public class CustomeException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the avaialble balance");
        int available=sc.nextInt();

        Bank bank=new Bank(available);
        System.out.println("Enter the withdraw amount");
        int withdraw=sc.nextInt();

        try {
            bank.amount(withdraw);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

}

