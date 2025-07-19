import java.util.*;
class Solution {
    // Generates a single row of Pascal's Triangle using combinations
    public static List<Integer> generaterow(int row){
        List<Integer> r = new ArrayList<>();
        r.add(1);  // First element is always 1
        long num = 1;
        // r-1 -> 1
        // r-2 -> 1 1
        // r-3 -> 1 2 1
        // r-4 -> 1 3 3 1
        for(int col = 1; col < row; col++){
            num = num * (row - col); // 5-1 -> 4       //num * 5-2 -> 4*3 = 12       nCr = nC(r-1) * (n - r + 1)/r
            num = num / col; // 4/1 -> 4               //12/2  = 6 ;
            r.add((int)num); // Cast to int before adding to list
        }
        return r;
    }

    // Builds the full Pascal's Triangle with numRows rows
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            ans.add(generaterow(i));
        }
        return ans;
    }
}

/*
 * Dry Run:
 * Input: numRows = 5

Output:
[
 [1],
 [1, 1],
 [1, 2, 1],
 [1, 3, 3, 1],
 [1, 4, 6, 4, 1]
]
Step-by-step:

generateRow(1) ➝ [1]

generateRow(2) ➝ 1, (1 * 1)/1 = 1 ➝ [1, 1]

generateRow(3) ➝ 1, (2 * 1)/1 = 2, (2 * 1)/2 = 1 ➝ [1, 2, 1]

generateRow(4) ➝ 1, 3, 3, 1

generateRow(5) ➝ 1, 4, 6, 4, 1

You're using nCr = nC(r-1) × (n – r + 1) / r — the combinatorics formula — which is efficient and avoids factorial overflow.
 */