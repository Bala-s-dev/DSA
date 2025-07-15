package loops;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int n1 = 12;
        int n2 = 24;
        int min =  Integer.MAX_VALUE;
        if(n1 < n2){
            min = n1;
        }
        else{
            min = n2;
        }
        int gcd = 0;
        for(int i=1;i<=min/2;i++){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
