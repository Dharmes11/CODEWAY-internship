import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class ATM 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int ch;

        BankAccount b = new BankAccount();

        while (true) 
        {
            System.out.print("\n");
            System.out.println("1. Deposit ");
            System.out.println("2. Check Balance ");
            System.out.println("3. Withdraw ");
            System.out.println("4. Transaction");
            System.out.println("5. Exit");

            System.out.print("\n=====>> Enter Your Choice : ");
            ch=sc.nextInt();

            switch (ch) 
            {
                case 1:
                        b. deposit();
                        break;

                case 2:
                        b.check_balance();
                        break;

                case 3:
                        b.Withdraw();
                        break;

                case 4:
                        b.transaction(); 
                        break;

                case 5:
                        System.exit(0);
            
                default:
                        System.out.println("\n=====>>   Invalid Choice   <<=====");
                        break;
            }
        }
    }    
}
class BankAccount
{
    double amount,balance=0.0,withdraw;
    List<Double> depositList = new ArrayList<>();
    List<Double> withdrawList = new ArrayList<>();

    Scanner sc=new Scanner(System.in);
    void deposit()
    {
        System.out.print("\n=====>> Enter The Deposit Amount : ");
        amount = sc.nextDouble();
        balance = balance + amount;
        depositList.add(amount);
        System.out.println( "\n=====>>    Your Amount Has Been Successfully Depsited   <<=====");
    }
    void check_balance()
    {
        System.out.println("\n =====>>   Your Balance : " + balance+"     <<=====");
    }
    void Withdraw()
    {
        System.out.print("\n=====>>   Enter Amount to be withdrawn: ");
        withdraw=sc.nextDouble();
        if(balance >= withdraw)
        {
            balance = balance - withdraw;
            withdrawList.add(withdraw);
            System.out.println("\n=====>>   Amount Withdraw Successfully !!!   <<=====");
        }
        else
        {
            System.out.println("\n=====>>   Your Bank Balance Not Sufficient Please Deposit Amount  <<=====");
        }
    }
    void transaction()
    {
        System.out.println("\n=====>>   Transaction History   <<=====");

        for (double amount : depositList) 
        {
            System.out.println("||     Deposit Amount: " + amount +"     ||");
        }

        for (double withdraw : withdrawList) 
        {
            System.out.println("||     Withdraw Amount: " + withdraw + "     ||");
        }
    }
}
