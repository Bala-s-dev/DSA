import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    //[4,5,1,2,8,3]
    // p 
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int performQuickSort(int[] arr, int low, int high){
        int p = arr[low];
        int i = low;
        int j = high;

        while(true){
            while(i <= j && arr[i] <= p){
                i++;
            }
            while(i <= j && arr[j] > p){
                j--;
            }
            if(i >= j) break;
            swap(arr, i, j);
        }
        //pivot swap
        swap(arr, low, j);
 
        return j;
    }
    public static void quicksort(int[] arr, int low, int high){
        if(low < high){
            int pivot = performQuickSort(arr, low, high);
            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int low = 0;
        int high = n - 1;
        quicksort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }
}
