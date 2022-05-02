import java.util.*;
public class Pattern13 {
    public static int fact(int a){
        int fact = 1;
        for(int i = 1; i <= a; i++){
            fact = fact * i;
            }
        return fact;
    }
    public static int comb(int n, int r){
        int comb = fact(n) / (fact(r) * fact(n-r));;
        return comb;
    }
    
    public static void main(String args[]) {
        
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        
        for(int j = 0; j <= num; j++){
            for(int k = 0; k <= j; k++){
               System.out.print(comb(j,k) + "\t");
            }
         System.out.println();
        }
    }
}