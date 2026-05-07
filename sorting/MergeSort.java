import java.util.*;

public class MergeSort {
    public static void merge(int[] arr, int low, int mid, int high){
        int temp[] = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int ind = 0;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[ind++] = arr[left++];
            }
            else {
                temp[ind++] = arr[right++];
            }
        }

        while(left <= mid){
            temp[ind++] = arr[left++];
        }
        while(right <= high){
            temp[ind++] = arr[right++];

        }
        ind = 0;
        for(int i = low; i <= high; i++){
            arr[i] = temp[ind++];
        }
    }

    public static void mergesort(int[] arr, int low, int high){
        //[1,4,2,5,3]

        if(low == high){
            return;
        }
        int mid = (low + high) / 2;

        mergesort(arr, low, mid);
        mergesort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        mergesort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }
}
