import java.util.*;
public class Pattern15 {
    public static void main(String args[]) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int nsp = 2;
        int nst = 1;
        
        int val = 1;
        
        for(int i = 1; i <= n; i++){
            int ival = val;
            for(int j = 1; j <= nsp; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= nst; j++){
                System.out.print(ival + "\t");
                if(j <= nst / 2){
                   ival++; 
                } else {
                    ival--;
                }
            }
                if(i <= n / 2){
                    nsp = nsp - 1;
                    nst = nst + 2;
                    val++;
                } else {
                    nsp = nsp + 1;
                    nst = nst - 2;
                    val--;
                }
            System.out.println();
        }
    }
}