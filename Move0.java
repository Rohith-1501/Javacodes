import java.util.Arrays;
public class Move0 {
    public static void main(String[] args) {
        int [] a ={1,2,0,0,4,0,9,1,0};
        int n = a.length;
        System.out.println(Arrays.toString(moveZero(a,n)));
    }
    private static int [] moveZero(int[] a, int n) {
        int i=0;
        int j=n-1;
        while(i<=j){
            if(a[i]==0 && a[j]!=0){
                int temp = a[i];
                a[i]=a[j];
                a[j] = temp;
                i++;
                j--;
            }
            if(a[i]!=0){
                i++;
            }
            if(a[j]==0){
                j--;
            }
        }
        return a;
    }
}
