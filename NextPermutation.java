import java.util.Arrays;

import static java.util.Collections.swap;

public class NextPermutation {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int n = a.length;
        System.out.println(Arrays.toString(nextPermutation(a, n)));
    }

    private static int[] nextPermutation(int[] a, int n) {

        int index = 0;
        for (int i = n - 1; i > 0; i--) {
            if (a[i] > a[i - 1]) {
                index = i;
                break;
            }
        }
        if (index == 0) {
            reverse(a, 0);
        } else {
            int previndex = index - 1;
            int min = Integer.MAX_VALUE;
            int nextIndex = index;
            for (int i = index; i < n; i++) {
                if (a[i] > a[previndex] && a[i] - a[previndex] < min) {
                    min = a[i] - a[previndex];
                    nextIndex = i;
                }
            }
            swap(a, previndex, nextIndex);
            reverse(a, index);
        }
        return a;
    }

    private static void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
