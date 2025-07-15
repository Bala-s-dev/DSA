import java.util.Arrays;
import java.util.Scanner;

public class insertelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // Read 4 elements
        for(int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the position to insert (1-based index): ");
        int pos = sc.nextInt();  // 1-based index
        System.out.println("Enter the element to insert: ");
        int el = sc.nextInt();

        // Adjust for 0-based index
        int index = pos - 1;

        // Shift elements to the right
        for(int i = 4; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert the new element
        arr[index] = el;

        System.out.println(Arrays.toString(arr));
    }
}
