import java.util.Arrays;

public class rotateimg {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] temp = new int[matrix.length][matrix[0].length];

        for(int i = 0 ; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++) {
                temp[j][matrix.length -1 -i] = matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i])); 
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println(Arrays.toString(temp[i])); 
        }
    }
}
