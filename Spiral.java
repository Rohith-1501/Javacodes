import java.util.Scanner;

public class Sprial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = sc.nextInt();
        int[][] spiral = new int[n][m];
        int value =1;
        int min_row = 0; int max_row = n-1;
        int min_col = 0; int max_col = m-1;
        while(value<=n*m){
            for (int col =min_col;col<=max_col;col++){
                spiral[min_row][col] = value;
                value++;
            }
            for(int row=min_row+1;row<=max_row;row++){
                spiral[row][max_col] =value;
                value++;
            }
            for (int col=max_col-1;col>=min_col;col--){
                spiral[max_row][col] = value;
                value++;
            }
            for(int row = max_row-1;row>=min_row+1;row--){
                spiral[row][0]=value;
                value++;
            }
            min_row++;
            max_row--;
            min_col++;
            max_col--;
        }

        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(spiral[i][j]+" ");
            }
            System.out.println();
        }
    }
}
