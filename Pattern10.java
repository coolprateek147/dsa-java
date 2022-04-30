import java.util.*;
public class Pattern10 {
    public static void main(String args[]) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i + j == n / 2 + 2 || i + j == n / 2 + n + 1 || i - j  == n / 2 || j - i == n / 2) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
          System.out.println();  
        }
    }
}