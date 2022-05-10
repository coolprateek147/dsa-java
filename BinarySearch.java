import java.util.*;
public class BinarySearch {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        
        int s = scn.nextInt();
        int foundAt = -1;
        
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
                foundAt = mid;
                break;
            }
        } 
        
        if(foundAt == -1){
            System.out.println("Not Found: " + foundAt);
        } else {
            System.out.println("Found at location: " + foundAt);
        }
    }
}