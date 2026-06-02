
package Exasample;


public class CheckedNull
{

  static String text;
    public static void main(String[] args)throws Textisnull
    {
      
        try{
            if(text==null)
        {
       
             throw new Textisnull("there is empty text");
        }
        
         int length=text.length();
         System.out.println("length" +length);
    }
         catch (Exception e)
                 {
                 System.out.println("null pointer exception");
                 }
     
    }
            
           
            
        
        }
    



