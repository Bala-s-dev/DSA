package patterns;

import java.util.Scanner;

public class BinaryRightAngle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int val = 1;

        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                val = 0;
            }

            else{
                if(val == 0){
                val = 1;
            }
            else{
                val = 1;
            }
            }

            for(int j = 1; j <= i; j++){
                System.out.print(val+ " ");
                if(val == 0){
                    val = 1;
                }
                else{
                    val = 0;
                }
            }
            
            System.out.println();
        }
    }
}
