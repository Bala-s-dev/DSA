import java.util.Scanner;

public class DiamondSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n * 2; i++){
            if(i < n){
                for(int j = 1; j <= n*2; j++){
                    if(j <= n - i){
                        System.out.print('*');
                    }
                    else if(j > n + i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            else{
                for(int j = 1; j <= n*2; j++){
                    if(j <= i - n + 1){
                        System.out.print('*');
                    }
                    else if(j > (2 * n - (i - n + 1))){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.err.println();
        }
    }
}
