
package Exasample;
import java.io.FileReader;


public class Sample {

    
    public static void main(String[] args) 
    {
        {
            main(args);// error exception
        }
        
       System.out.println("hii");
       int a=100;
       try{
            int b=a/0;  
       }
       catch(Exception e)
       {
      
               System.out.println("cannot divided by zero");//uncked exception nullpointer exception      
        
      }
//        int a[]=new int [3];
//        System.out.println("hi");
//        
//        try{
//            a[3]=100;
//        }
//        catch(Exception e)
//        {
//        System.out.println("index full");// unchecked exception arrayoutof index;
//        }
//        
        for(int i=0;i<5;i++)
    {
         System.out.println("sabi");
       }
       
     try{
         FileReader  f=new FileReader("myname.txt");
     }
     catch(Exception e)
        
     {
              
                   System.out.println("file not in the path");
               
        }
     
    }    }
    

