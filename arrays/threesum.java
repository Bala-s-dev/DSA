import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class threesum {
    public static void main(String[] args) {
        //Bruteforce
        // Time Complexity: O(n³ * log 3) → Simplifies to O(n³)
        // int[] arr = {-1,0,1,2,-1,-4};
        //  Set<List<Integer>> result = new HashSet<>();
        
        // for(int i = 0; i < arr.length; i++){
            //     for(int j = i+1; j < arr.length; j++){
                //         for(int k = j+1; k < arr.length; k++){
                    //             if(arr[i] + arr[j] + arr[k] == 0){
        //                 List<Integer> sum = Arrays.asList(arr[i],arr[j],arr[k]);
        //                 Collections.sort(sum);
        //                 result.add(sum);
        //             }
        //         }
        //     }
        // }
        // List<List<Integer>> resultset = new ArrayList<>(result);
        // System.out.println(resultset);
        
        //optimal
        // Time complexity -> sorting O(n logn) + O(n*n)
        int[] arr = {-1,0,1,2,-1,-4};
        Arrays.sort(arr);       // [-4,-1,-1,0,1,2]
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < arr.length ; i++){
            if(i > 0 && arr[i]==arr[i-1]) continue;

            int l = i+1;
            int r = arr.length-1;
            while(l<r){
                int sum = arr[i] + arr[l] + arr[r];
                if(sum == 0){
                    result.add(Arrays.asList(arr[i],arr[l],arr[r]));
                    while(l < r && arr[l] == arr[l+1]) l++;
                    while(l < r && arr[r] == arr[r-1]) r++;
                    l++;
                    r--;
                }
                else if(sum > 0){
                    r--;
                }
                else if (sum < 0){
                    l++;
                }
            }
        }
        System.out.println(result);
    }
}
