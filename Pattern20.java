import java.util.*;
public class Pattern20 {
    public static void main(String args[]) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int nst = 1;
        
        for(int i = 1; i <= n; i++){
           // for(int j = 1; j <= nst; j++){
                    System.out.print("*\t");
           // }
            for(int j = 2; j < n; j++){
                if( i > n / 2 && (i == j || i + j == n + 1)) {
                    System.out.print("*\t");
                }
                else {
                     System.out.print("\t");
                }
            }
          //  for(int j = 1; j <= nst; j++){
                    System.out.print("*\t");
          //  }
            System.out.println(); System.out.println();
        }
    }
}