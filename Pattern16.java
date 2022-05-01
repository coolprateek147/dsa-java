import java.util.*;
public class Pattern16 {
    public static void main(String args[]) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int nst = 1;
        int nsp = 2 * n - 3;
        
        int val = 1;
        
        for(int i = 1; i <= n; i++){
            if(i < n){
            for(int j = 1; j <= nst; j++){
                    System.out.print(val + "\t");
                   // if(j <= nst / 2){
                        val++;
                  //  }
            }
            for(int j = 1; j <= nsp; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= nst; j++){
                val--;
                    System.out.print(val + "\t");
                  //  if(j <= nst / 2){
                        
                  //  } 
            }
            nst++; 
            nsp = nsp - 2;
            
            System.out.println();
            }
            
            else
            {
                for(int k = 1; k < nst + n; k++){
                    System.out.print(val + "\t");
                    if(k < (nst + n) / 2) {
                        val++;
                    }
                    else {
                        val--;
                    }
                }
            }

        }
        
    }
}