import java.util.HashMap;
import java.util.Scanner;

public class countduplicates {
    public static void main(String[] args) {

        // Method 1 to count duplicate elements that appears twice
        // Time - o(n^2);
        // Space - o(1);

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // for (int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // int count =0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(arr[i]==arr[j]){
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(count);

        //Method 2 count duplicate elements using HASHMAP
        //Time - O(n)
        //Space - O(n)
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int count=0;
        for(int val : map.values()){
            if(val > 1){
                count++;
            }
        }
        System.out.println(count);
    }
}
