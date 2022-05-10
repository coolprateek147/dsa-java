import java.util.*;
public class StartIndexLastIndex {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        
        int s = scn.nextInt();
        int si = 0;
        
        int left = 0;
        int right = arr.length - 1;
        
        while(left <= right){
            int mid = (left + right) / 2;
            if(s > arr[mid]){
                left = mid + 1;
            }
            else if(s < arr[mid]){      
                right = mid - 1;
            }
            else{
                si = mid;
                right = mid - 1;
            }
        } 
        
        System.out.println(si);
        
        int li = 0;
        
        left = 0;
        right = arr.length - 1;
        
        while(left <= right){
            int mid = (left + right) / 2;
            if(s > arr[mid]){
                left = mid + 1;
            }
            else if(s < arr[mid]){      
                right = mid - 1;
            }
            else{
                li = mid;
                left = mid + 1;
            }
        } 
        
        System.out.println(li);
        
    }
}