import java.util.*;
public class numberSystemD2B {
    public static void main(String args[]) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int ans = decimalToAnyBase(n,b);
        System.out.println(ans);
        
    }
    
    public static int decimalToAnyBase(int num,int base){
        int dn = 0;
        int tnp = 1;
        while(num > 0){
            int rem = num % base;
            num = num / base;
            dn = dn + rem * tnp;
            tnp *= 10;
        }
        return dn;
    }
}