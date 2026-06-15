package Exasample;

import java.util.Scanner;


public class ExcepHw 
{
    

    public static void main(String[] args) throws InvalidUserIdException
    {
      Scanner sc=new Scanner(System.in);
    System.out.println("enter the user id:");
      String id=sc.nextLine();
        
         try{
             
           int number= Integer.parseInt(id);
         
             if(number<=0)
             {
                 throw new InvalidUserIdException("userid must be positive");
             }
          
             else{
                 System.out.println("valid user id is succefully mztched");
             }
         }
        
             catch(NumberFormatException e)
                     {
                     System.out.println("userid must be number");
                     }
         catch(InvalidUserIdException e)
         {
             System.out.println(e.getMessage());
         }
           }
         
        
       
       }
    

