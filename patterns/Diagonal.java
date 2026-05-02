package patterns;
import java.util.*;
public class Diagonal {
    public static void printUpperPyramid(int n){
        for(int i = 1; i <= n; i++){
            //for space
            for(int space = 1; space <= n - i; space++){
                System.out.print(" ");
            }
            //for character
            for(int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void printLowerPyramid(int n){
        for(int i = 1; i <= n; i++){
            // for space
            for(int space = 1; space < i; space++){
                System.out.print(" ");
            }
            //for character
            for(int j = 0; j <= ((2 * n) - (2 * i)); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printUpperPyramid(n);
        printLowerPyramid(n);
        
    }

}
