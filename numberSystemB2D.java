import java.util.*;
public class numberSystemB2D {
    public static void main(String args[]) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
    //int ans = decimalToAnyBase(n,b);
        int ans = anyBaseToDecimal(n,b);
        System.out.println(ans);
        
    }
    
  /*  public static int decimalToAnyBase(int num,int base){
        int dn = 0;
        int tnp = 1;
        while(num > 0){
            int rem = num % base;
            num = num / base;
            dn = dn + rem * tnp;
            tnp *= 10;
        }
        return dn;
    } */
    
    public static int anyBaseToDecimal(int num,int base){
        int dn = 0;
        int bp = 1;
        while(num > 0){
            int rem = num % 10;
            num = num / 10;
            dn = dn + rem * bp;
            bp *= base;
        }
        return dn;
    }
}