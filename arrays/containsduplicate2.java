import java.util.HashSet;

public class containsduplicate2 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3};
        int k = 2;
        // Bruteforce

        // for(int i = 0; i < arr.length; i++){
        //     for(int j = i+1; j <= k + i && j < arr.length ; j++ ){
        //         if(arr[i] == arr[j]){
        //             System.out.println("True");
        //             return;
        //         }
        //     }
        // }
        // System.out.println("False");


        //Optimal
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < arr.length; i++){
            if(set.contains(arr[i])){
                System.out.println("True");
                return;
            }
            set.add(arr[i]);
            if(set.size() > k){
                set.remove(arr[i-k]);
            }
        }
        System.out.println("false");

    }
}