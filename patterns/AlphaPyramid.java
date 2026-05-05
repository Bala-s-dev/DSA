import java.util.Scanner;

public class AlphaPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char c = 'A';

        for(int i = 1; i <= n; i++){
            c = 'A';
            //for space
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            //for char
            for(int k = 1; k <= 2 * i - 1; k++){
                if (k < i) {
                    System.out.print(c);
                    c++;
                }
                else{
                    System.out.print(c);
                    c--;
                }

            }
            System.out.println();
        }
    }
}
