import java.util.ArrayList;
import java.util.Arrays;
public class Leaders {
    public static void main(String[] args) {
        int [] a = {16,17,4,3,5,2};
        int n = a.length;
        System.out.print("The leaders in an Array : ");
        System.out.println(Arrays.toString(leaders(a,n)));
    }
    private static Object[] leaders(int[] a, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        for (int i=a.length-1;i>=0;i--){
            if(a[i]>max){
                list.add(a[i]);
                max = a[i];
            }
            else{
                continue;
            }
        }
        return  list.toArray();
    }
}
