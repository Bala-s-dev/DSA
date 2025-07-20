public class maximizingsubarray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int maxsub = 0;
        int curr = 0;

        for(int num : arr){
            curr = curr + num;
            maxsub = Math.max(maxsub, curr);

            if(curr < 0){
                curr = 0;
            }
        }
        System.out.println(maxsub);
    }
}
