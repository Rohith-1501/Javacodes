import java.util.Scanner;

public class CoinChangeProblem {
    public static void main(String[] args) {

        int[] coin ={1,2,3};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target value :");
        int n = sc.nextInt();
        System.out.println(coins(coin,n));
    }

    private static int coins(int[] coin, int n) {

        int[][] coins = new int[coin.length + 1][n + 1];
        for(int i = 0; i <= coin.length; i++){
            coins[i][0] = 1;
        }

        for(int i = 1; i <= coin.length; i++){
            for(int j = 1; j <= n; j++){
                if(coin[i - 1] > j){
                    coins[i][j] = coins[i-1][j];
                }
                else{
                    coins[i][j] = coins[i-1][j] + coins[i][j-coin[i - 1]];
                }
            }
        }

        return coins[coin.length][n];
    }
}
