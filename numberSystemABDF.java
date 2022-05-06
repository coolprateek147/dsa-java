import java.util.*;
public class numberSystemABDF {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int base = scn.nextInt();
        
        int ans = anyBaseDiff(num1,num2,base);
        System.out.println(ans);
        
    }
    public static int anyBaseDiff(int n1,int n2,int b){
        int c = 0;
        int tp = 1;
        int diff = 0;
        while(n1 > 0 || n2 > 0 || c > 0 ){
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int d = d1 - c - d2;
            if(d < 0){
                d = d + b;
                c = 1;
            }
            else{
                c = 0;
            }
            
            diff = diff + d * tp;
            tp = tp * 10;
        }
        return diff;
    }
}