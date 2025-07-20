public class longestcommonpreifx {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        /*
         * i - [0] -> f
         * j - [j][i] -> [1][0] ->  f -> && [2][0] -> f -> match
         * i - [1] -> l
         * j - [j][i] -> [1][1] ->  l -> && [2][1]  -> l => match
         * i - [2] -> o
         * j -> [j][i] -> [1][2] -> o -> mismatch return and print the ans
         */
        String ans="";
        for(int i = 0; i < strs[0].length(); i++){
            char ch = strs[0].charAt(i);
            for(int j = 1; j < strs.length ; j++){
                if( i >= strs[j].length() || strs[j].charAt(i) != ch){
                    ans = strs[0].substring(0,i);
                    System.out.println(ans);
                    return;
                }
            }
        }
        ans = strs[0];
        System.out.println(ans);
    }
}