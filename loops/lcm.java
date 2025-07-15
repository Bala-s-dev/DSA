package loops;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 12;
        int n2 = 24;
    
        int max = Integer.MIN_VALUE;
        if(n1 > n2){
            max = n1;
        }
        else{
            max = n2;
        }
        int lcm;
        int curr = max;
        while(true){
            if(curr%n1 == 0 && curr%n2 == 0 ){
                lcm = curr;
                break;
            }
            curr = curr + max; 
        }
        System.out.println(lcm);
    }
    
}
