import java.util.*;
public class arrayFindElement {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        
        int d = scn.nextInt();
        
        boolean isFound = false;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == d){
                isFound = true;
                System.out.println("Found at offset: " + i);
                break;
            }
            else {
                isFound = false;
            }
        }
        
        if(isFound == false){
           System.out.println("Offset: " + -1); 
        }
        
    }
}