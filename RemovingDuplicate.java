import java.util.Arrays;
import java.util.HashSet;

public class RemovingDuplicate {

    public static void main(String[] args) {

        int [] a = new int[]{1,2,2,3,4,5};
        int n =a.length;
        System.out.println("The size of the array after removing duplicates: "+(removeDuplicate(a, n)));
    }

    private static int removeDuplicate(int[] a, int n) {

        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(a[i]);
        }
        return hs.size();
    }

}
