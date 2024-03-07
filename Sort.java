//sort an Array of 0's 1's 2's
public class Sort {
    public static void main(String[] args) {
        int [] a  = {2, 0, 1, 2, 0, 1, 2};
        int n = a.length-1;
        sorting(a, n);
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    private static void sorting(int[] a, int n) {
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if (a[mid] == 0) {
                int temp = a[mid];
                a[mid] = a[low];
                a[low] = temp;
                mid++;
                low++;
            }
            else if (a[mid] == 1) {
                mid++;
            }
            else {
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
        }
    }
}


