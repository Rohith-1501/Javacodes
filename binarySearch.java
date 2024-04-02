public class BinarySearch {
    static int binarySearch(int[] a, int target, int start, int end){
        int mid = 0;
        int star = start;
        int en = end;
        while(star <= en){
            mid = star + (en - star) / 2;
            if(a[mid] == target){
                return mid;
            } else if (target > a[mid]) {
                star = mid + 1;
            } else {
                en = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {4,5,6,7,0,1,2};
        int target = 0;
        int pivot = 0;

        for (int j : a) {
            pivot = Math.max(j, pivot);
        }
        int pita = binarySearch(a, pivot, 0, a.length - 1);
        int result = binarySearch(a, target, 0, pita);
        System.out.println("Index of target (" + target + ") in first partition: " + result);

        int result1 = binarySearch(a, target, pita + 1, a.length - 1);
        System.out.println("Index of target (" + target + ") in second partition: " + result1);
    }
}
