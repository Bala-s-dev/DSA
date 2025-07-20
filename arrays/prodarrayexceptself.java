import java.util.Arrays;

public class prodarrayexceptself {
    public static void main(String[] args) {
        //Brute force
        int[] arr = {1,2,3,4};
        // int[] res = new int[arr.length];
        // for(int i = 0; i < arr.length; i++){
        //     int prod = 1;
        //     for(int j = 0; j < arr.length; j++){
        //         if(i!=j){
        //             prod = prod * arr[j]; 
        //         }
        //     }
        //     res[i] = prod;
        // }
        // System.out.println(Arrays.toString(res));

        //optimal
        // T - O(n);
        // S - O(n);
        int preifx = 1;
        int postfix = 1;

        int[] res = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            res[i] = preifx;
            preifx = preifx * arr[i];
        }
        for(int i = arr.length-1; i >= 0; i--){
            res[i] = res[i] * postfix;
            postfix = postfix * arr[i]; 
        }
        System.out.println(Arrays.toString(res));
    }
}
