/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;
import java.util.*;
class atm
{
    private int pin;
    private float balance;
    public void pincheck()
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Please enter your card PIN");
        int pin =sc.nextInt();
        
        if(pin==12345)
        {
            System.out.println("   WELCOME SIR   ");
            System.out.println("How can I help you");
            list();
        }
        else
        {
            System.out.println("     NOTE     ");
            System.out.println("Please enter the valid PIN");
            again();
        }
    }
    private void again()
    {
        pincheck();
    }
    public void list()
    {
       System.out.println("1.Account balance amount");
       System.out.println("2.Withdraw amount");
       System.out.println("3.Deposit amount");
       System.out.println("4.EXIT");
       Scanner sc = new Scanner (System.in);
       System.out.println("Press option from(1 to 4) as you like");
       int a= sc.nextInt();
       switch(a)
       {
           case 1:
           {
               accountbalance();
               break;
           }
           case 2:
           {
               withdraw();
               break;
           }
           case 3:
           {
               deposit();
               break;
           }
           case 4:
           {
               break;
           }
           default:
           {
               System.out.println("Enter the valid option");
               list();
               break;
           }      
       }
    }
    public void accountbalance()
    {
        System.out.println("Balance"+balance);
        System.out.println("Do you want continue 1 or exit 0 ");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if(a==1)
        {
            list();
        }
    }
    public void withdraw()
    {
        System.out.println("Enter the amount to withdraw ");
        Scanner sc = new Scanner(System.in);
        float withdraw= sc.nextFloat();
        
        if(withdraw<balance)
        {
             balance = balance- withdraw;
             System.out.println("your amount is Sucessfully withdrawed"); 
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
        System.out.println("Do you want continue 1 or exit 0 ");
        int b= sc.nextInt();
        if(b==1)
        {
            list();
        }          
    }
    public void deposit()
    {
        System.out.println("Enter an Amout to deposit");
        Scanner sc = new Scanner(System.in);
        float deposit=sc.nextFloat();
        balance=deposit+balance;
        System.out.println("Your Amount is successfully deposited");
        System.out.println("Do you want continue 1 or exit 0 ");
        int b= sc.nextInt();
        if(b==1)
        {
            list();
        }
    }  
}
public class atm_machine 
{
    public static void main(String[] args) {
        System.out.println("     WELCOME     ");
        atm machine= new atm();
        machine.pincheck();
    }
}
