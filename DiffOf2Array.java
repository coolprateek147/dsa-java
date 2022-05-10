import java.util.*;
public class DiffOf2Array {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n2 = scn.nextInt();
        int n1 = scn.nextInt();
        
        int[] arr2 = new int[n2];
        int[] arr1 = new int[n1];
        
        for(int i = 0; i< arr2.length; i++){
            arr2[i] = scn.nextInt();
        }
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = scn.nextInt();
        }
        
        int[] diff = new int[n2];
        int c = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;
        
        while(k >= 0){
            int d = arr2[j] - c;
            if(i >= 0){
                d = d - arr1[i];
            }
            if(d < 0){
                d = d + 10;
                c = 1;
            }
            else {
                c = 0;
            }
            diff[k] = d;
            i--;
            j--;
            k--;
        }
        
        int x = 0;
        while(x < diff.length){
            if(diff[x] != 0){
                break;
             } else {
                 x++;
             }
        }
        while(x < diff.length){
            System.out.print(diff[x]);
            x++;
        }
    }
}