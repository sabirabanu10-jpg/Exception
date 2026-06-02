
package Exasample;

import java.util.Scanner;


public class Student
{
    static  Scanner sc=new Scanner(System.in);
   int marks=-1;
    public static void main(String[] args) throws IllegalArgumentException 
    {
        Student st=new Student();
        st.menu();
        
        
    }
    
 
    void menu() throws IllegalArgumentException
    {
        boolean result=true;
      do{  
        System.out.println(" *Student details*");
        System.out.println("Enter the choice :");
        int choice=sc.nextInt();
        System.out.println(" 1.Enter the student marks :");
        System.out.println("2.Display the marks");
        System.out.println("3.exiit");
        
          
        switch(choice)
        {
            case 1:
                    
            {
        
            System.out.println("enter the marks (0-100): ");
            int input=sc.nextInt();
           
          try{
            if(input<0||input>100)
            {
               throw new IllegalArgumentException("marks enter bewteen 0 to 100");
               
            }
            
            marks=input;
                System.out.println("marks enter successfully");
            }
            catch(IllegalArgumentException e)
                    {
                    System.out.println("illegalargumentexceptionerror" + e.getMessage());
                    }
            }
            
            case 2:
            {
            if(marks==-1)
            {
            System.out.println("no marks  entered yet");
            
            }
            else
            {
            System.out.println("stored marks" +marks);
            }
            break;
            }
            case 3:
            {
            System.out.println("exit");
            result=false;
            break;
            }
            default:
            {
                System.out.println("invalid choice");
            }
           }
            
            
            
      }while(result);
        
    
    
  }
}
