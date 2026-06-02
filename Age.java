
package Exasample;


public class Age 
{
    public static void main(String[] args) throws AgeDecrese, Exception {
        
    
    int a=16;
    if(a>=18)
    {
    System.out.println("eligible");
   }
    else 
    {
        throw new AgeDecrese("above 18 value anly eligible");
    }
    
}
}
