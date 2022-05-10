import java.util.*;
public class BarChart {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        int ht = max;
        while(ht >= 1){
            for(int i = 0 ; i < arr.length; i++){
                if(arr[i] >= ht){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            ht--;
            System.out.println();
        }
    }
}