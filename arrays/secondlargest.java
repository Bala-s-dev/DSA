import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
		// write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		int sec = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				sec = max;
				max = arr[i];
			}
			else if(arr[i]>sec && arr[i]!=max){
				sec = arr[i];
			}
		}
		System.out.println(sec);
	}
}
