import java.util.Scanner;
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter String 2: ");
        String s2 = sc.nextLine();
        int n = s1.length();
        int m = s2.length();
        System.out.println("Longest common subsequence of the Strings is : "+lcs(s1,s2,n,m));
    }
    private static int lcs(String s1, String s2, int n, int m) {

        int [][] dp = new int[n+1][m+1];

        for (int i=0;i<=n;i++){
            for (int j=0;j<=m;j++){
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[n][m];
    }
    private static int max(int x, int y) {
        return x > y ? x : y;
   }
}
