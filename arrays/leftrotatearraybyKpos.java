import java.util.Arrays;
import java.util.Scanner;

public class leftrotatearraybyKpos {
        public static void brute(int[] nums){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println("Enter the K to rotate: ");
            int k = sc.nextInt();

            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            for(int r=0;r<k;r++){
                int start = arr[0];
                for(int i=0;i<n-1;i++){
                    arr[i] = arr[i+1];
                }
                arr[arr.length-1] = start;
            }

            System.out.println(Arrays.toString(arr));

        }

        public static void better(int[] arr,int n, int k){
            
            // for(int i=0;i<n;i++){
            //     arr[i] = sc.nextInt();
            // }
            int[] temp = new int[k];
            for(int i=0;i<k;i++){
                temp[i] = arr[i];
            }
            for(int i=k;i<n;i++){
                arr[i-k] = arr[i];
            }

            int e=0;
            for(int i=n-k;i<n;i++){
                arr[i] = temp[e++];
            }
            System.out.println(Arrays.toString(arr));
        }


         public static void reverse(int[] nums, int start, int end){
            while(start<end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        public static void optimal(int[] arr,int n, int k){
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the K times to rotate: ");
        int k = sc.nextInt();
        int[] arr = new int[n];
        //Method 1 : Brute force
        //Time Complexity = O(k * n)
        //Space = O(1)

        brute(arr);


        //Method 2 : Better approach
        //OUTPUT
        // 3 - k
        // 1 2 3 4 5
        // 4 5 1 2 3
        // Time Complexity: O(n)
        // Space Complexity : O(n)
        
        better(arr,n,k);
        


        // Method 3 : Optimal 
        //OUTPUT
        // 3 - k
        // 1 2 3 4 5   
        // rev 1 2 3 - 3 2 1 4 5
        // rev 4 5 - 3 2 1 5 4
        // total - 4 5 1 2 3
        // 4 5 1 2 3
      
        optimal(arr, n, k);
    }
}

