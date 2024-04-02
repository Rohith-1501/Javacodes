import java.util.*;
public class CountOcc {
    static int countOccurences(String str, String word) {
        String a[] = str.split(" ");
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (word.equals(a[i]))
                count++;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the word: ");
        String word = sc.next();
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        for (int i = 0; i < n; i++) {
            map.put(countOccurences(arr[i], word), arr[i]);
        }
        Set s = map.entrySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            Map.Entry m = (Map.Entry) itr.next();

            System.out.println(m.getValue());
        }

    }
}
