import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int row = 0;

        int value = 1;
        while(row<n){
            int column = 0;
            while(column<m){
                a[row][column] = value;
                value++;
                column++;
            }
            row++;
        }
        System.out.println("Transposed Matrix : ");
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }

    }


}
