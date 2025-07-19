// LeetCode 73: Set Matrix Zeroes
// Time: O(m * n) | Space: O(m + n)
// Author: ChatGPT (Formatted for VS Code)

class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        // Arrays to mark rows and columns that need to be zeroed
        int[] r = new int[row];
        int[] c = new int[col];

        // Step 1: Find all 0s and mark their rows and columns
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    r[i] = 1;  // Mark this row
                    c[j] = 1;  // Mark this column
                }
            }
        }

        // Step 2: Set matrix[i][j] to 0 if its row or column is marked
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (r[i] == 1 || c[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

/*
 ✅ Dry Run Example:
Input:

matrix = {
    {1, 2, 3},
    {4, 0, 6},
    {7, 8, 9}
};
Execution:

Step 1: Found matrix[1][1] == 0
➤ mark r[1] = 1, c[1] = 1

Step 2: Apply markings:

Result = {
    {1, 0, 3},
    {0, 0, 0},
    {7, 0, 9}
};
✅ Notes for GitHub ReadMe:

### Problem: Set Matrix Zeroes (LeetCode 73)

If an element is 0, set its entire row and column to 0. Do it in-place.

- Time Complexity: O(m * n)
- Space Complexity: O(m + n)
- Language: Java
- Status: ✅ Solved

Approach:
1. Use two arrays `r[]` and `c[]` to mark rows and columns that need to be zeroed.
2. First pass: identify all positions of 0s.
3. Second pass: update all relevant cells to 0 using the markers.

Example Input:
[ [1, 2, 3],
[4, 0, 6],
[7, 8, 9] ]

makefile
Copy
Edit

Output:
[ [1, 0, 3],
[0, 0, 0],
[7, 0, 9] ]


 */