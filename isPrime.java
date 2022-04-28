import java.util.*;

public class isPrime
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        
        int p = 2;
        while(p < num)
        {
            int rem = num % p;
            if(rem == 0)
            {
                System.out.println("The number is Non Prime");
                break;
            }
           
            System.out.println("The number is Prime");            
            break;
            
        }p++;
    }
}
