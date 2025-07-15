import java.util.Arrays;
import java.util.Scanner;

public class mergesortedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }
        int[] newarr = new int[n1+n2];
        int index1 = 0;
        int index2 = 0;
        int k=0;
        while(index1 < n1 && index2 < n2){
            if(arr1[index1]<arr2[index2]){
                newarr[k] = arr1[index1];
                index1++;
            }
            else{
                newarr[k] = arr2[index2];
                index2++;
            }
            k++;
        }
        while (index1 < n1) {
            newarr[k] = arr1[index1];
            index1++;
            k++;
        }
        while (index2 < n2) {
            newarr[k] = arr2[index2];
            index2++;
            k++;
        }
        System.out.println(Arrays.toString(newarr));
    }
}
