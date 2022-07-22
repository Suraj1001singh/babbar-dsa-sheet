
//--------TABULATION
// Varaition of LCS 
// Hint : take two str (same) and find LCS such that i!=j

public class Solution3 {
    public int LongestRepeatingSubsequence(String str) {
        int n = str.length();
        int dp[][] = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i != j && str.charAt(i - 1) == str.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[n][n];
    }
}
// Time complexity : O(n^2)
// Space complexity : O(n^2)
