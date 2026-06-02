
package Exasample;

import java.util.Scanner;


public class Accountbalance
{
   Scanner sc=new Scanner(System.in) ;
   int balance=10000;
   
    public static void main(String[] args)
    {
        Accountbalance ac=new Accountbalance();
        ac.menu();
        
    }

     void menu() 
{
    
    boolean result=true;
do{
    System.out.println("ACCOUNT BALANCE CHECKING");  
    System.out.println("Enter the choice :");
    int choice=sc.nextInt();
    System.out.println(" 1. withdraw amount ");
    System.out.println("2.Check the balance ");
    System.out.println("3.exit");
    
    switch(choice)
    {
        case 1:
        {
            System.out.println(" 1.Enter the withdraw amount : ");
            int with=sc.nextInt();
           
            try
            {
            withdraw(with);
           
                System.out.println("withdraw successfully");
                System.out.println("Remaining balance" +balance);
            }
            
            catch(InsufficientBalanceException e)
                    {
                    System.out.println("ERROR :"+ e.getMessage());
                    }
                    break;
             }
        
        case 2:
        {
            
            System.out.println("CurrentBalnce :" +balance);
            break;
        }
        case 3:
        {
            System.out.println("exit");
            result=false;
        }

        }
    
    }while(result);
        
    }
     void withdraw(int amount)throws InsufficientBalanceException
     {
         if(amount>balance)
         {
             throw new InsufficientBalanceException("Insufficientbalance!we cannot reterived");
         }
         balance-=amount;
     }
}
