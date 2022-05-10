import java.util.*;
public class InverseOfArray {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        int[] inv = new int[n];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        
        for(int i = 0; i < inv.length; i++){
            inv[arr[i]] = i;
        }
        
        for(int i = 0; i < inv.length; i++){
            System.out.print(inv[i] + " ");
        }
    }
}
