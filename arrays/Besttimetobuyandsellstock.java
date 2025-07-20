public class Besttimetobuyandsellstock {
   public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int buymin = arr[0];
        int prof = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < buymin){
                buymin = arr[i];
            }
            prof = Math.max(prof, arr[i] - buymin);
        }
        System.out.println(prof);
    }
}
