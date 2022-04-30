import java.util.*;
public class Pattern14 {
    public static void main(String args[]) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int ja = 1; ja <= 10; ja++ ){
            System.out.println(n + " * " + ja + " = " + n*ja);
        }
    }
}