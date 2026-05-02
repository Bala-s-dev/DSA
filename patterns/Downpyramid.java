package patterns;
import java.util.*;
public class Downpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //for spaces

            for(int space = 1; space < i; space++){
                System.out.print(" ");
            }

            //for character
            for(int j = 0; j <= ((2 * n) - 2*i); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
