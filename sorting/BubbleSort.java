import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //comapring two numbers for min
    public static void bubblesort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int sw = 0;
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                    sw = 1;
                }
            }
            if(sw == 0) break;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
