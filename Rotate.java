import java.util.*;
public class Rotate
{
    public static void main(String[] args) {
        
        //Rotate a number n k times
        
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        int temp = n;
        int nod = 0;
        
        while(temp != 0){
            temp = temp / 10;
            nod++;
        }
        
        k = k % nod;
        if(k < 0){
            k = k + nod;
        }
        
        //int div = (int)Math.pow(10,k);
       // int mul = (int)Math.pow(10,nod-k);
        int div = 1;
        int mul = 1;
        for(int i = 1; i <= nod; i++) {
            if(i <= k){
                div = div * 10;
            }
            else {
                mul = mul * 10;
            }
        }
        
        int q = n / div;
        int r = n % div;
        int ans = r * mul + q;
        System.out.println(ans);
    }
}
