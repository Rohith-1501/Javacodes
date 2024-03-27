import java.util.Scanner;
public class MinimumEditDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter String2: ");
        String s2 = sc.nextLine();
        int n = s1.length();
        int m = s2.length();
        System.out.println("The minimum number of operation required to convert string 1 to string 2 is : "+editDistance(s1,s2,n,m));
    }
    private static int editDistance(String s1, String s2, int n, int m) {
        int[][] dp = new int[n+1][m+1];

        for (int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0){
                    dp[i][j]=j;
                } else if (j==0) {
                    dp[i][j]=i;
                } else if (s1.charAt(i-1)==s2.charAt(j-1)) {
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]=1+min(dp[i][j-1],dp[i-1][j],dp[i-1][j-1]);
                }
            }
        }
        return dp[n][m];

    }

    private static int min(int x, int y, int z) {
        if(x<=y && x<=z){
            return x;
        }
        if(y<=x && y<=z){
            return y;
        }
        else{
            return z;
        }
    }
}
