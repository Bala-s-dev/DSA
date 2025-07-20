import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class twosum {
    public static void main(String[] args) {
        //Brute force 
        // Time - o(n*n)

        // int n;
        // Scanner sc = new Scanner(System.in);
        // n = sc.nextInt();
        // int[] arr = new int[n];

        // for(int i = 0; i < n ; i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("Enter your target to find: ");
        // int target = sc.nextInt();

        // for(int i = 0 ; i < n; i++){
        //     for(int j = i+1 ; j < n; j++){
        //         if(arr[i] + arr[j] == target){
        //             System.out.println("Found at index "+i+" and "+j);
        //             break;
        //         }
        //     }
        // }


        //optimal using ArrayList
        /*
         * Example:
         * arr = [1,2,3,4,5]     target = 6
         * find the differnece between the target and the arr[i]
         * and then check if aldready the diff is present in the HashMap
         * or else add the arr[i] and index into HashMap
         */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target to find");
        int target = sc.nextInt();

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){      // [1,2,3,4,5]  t - 3
            int diff = target - arr[i];           //  Map [2,1] then arr[i] is 2 and 2 is present in HashMap
            if(map.containsKey(diff)){
                System.out.print(Arrays.toString(new int[]{map.get(diff), i}));
            }
            map.put(arr[i],i);
        }

    }
}
