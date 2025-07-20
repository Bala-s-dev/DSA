public class nextpermutation {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        //check for ascending , descending
        // 1 2 4 3
        // 2 1 3 4
        int asc = 0;
        int desc = 0;
        int i = 0;
        for(i = 1; i < arr.length; i++){
            if(arr[i]>arr[i-1]){
                asc = 1;

            }
            else{
                desc = 1;
            }
        }
        if(asc == 1){
            for()
        }
    }
}
