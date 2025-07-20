public class maximumproductsubarray {
    public static void main(String[] args) {
        // bruteforce
        int[] arr = {2,3,-2,4};
        int maxvalue = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            int prod = 1;
            for(int j = i ; j < arr.length; j++){
                prod = prod * arr[j];
                maxvalue = Math.max( maxvalue,prod );
            }
        }
        System.out.println(maxvalue);
    }
}
