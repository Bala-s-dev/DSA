package loops;

import java.util.Scanner;

public class fibonacci {
   public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    int range = sc.nextInt();
    int a = 0;
    int b = 1;
    //0 1 1 2 3
    //0 1 
    int temp = 0;
    for(int i=0;i<range;i++){
        System.out.println(a);
        temp = a+b;
        a = b;
        b = temp;
    }
   } 
}
