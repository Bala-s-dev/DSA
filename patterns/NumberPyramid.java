import java.util.*;
class NumberPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int val = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(val++ + " ");
            }
            System.out.println();
        }
    }
}