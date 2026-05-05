import java.util.Scanner;

public class AlphaDecPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char c = (char)('A' + n);

        for(int i = 1; i <= n; i++){
            c--;
            char val = c;
            for(int j = 1; j <= i; j++){
                System.out.print(val + " ");
                val++;
            }
            System.out.println();
        }


    }
}
