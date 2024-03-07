public class SecondLargest {
    public static void main(String[] args) {
        int [] a ={5,3,4,2,1};
        System.out.print("The second largest Element is : ");
        System.out.println(secondLargest(a));
    }

    private static int secondLargest(int[] a) {
        int largest = 0;
        int secondlargest = 0;
        for (int j : a) {
            if (j > largest) {
                largest = j;
            } else if (j > secondlargest) {
                secondlargest = j;
            }
        }
        return secondlargest;
    }
}
