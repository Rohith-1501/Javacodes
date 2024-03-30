import java.util.Scanner;
public class BinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary string: ");
        String s = sc.nextLine();
        System.out.println("the total sum of given binary string is "+binaryString(s));
        sc.close();
    }
    private static int binaryString(String s) {
        if (s == null) {
            return -1;
        }
        int result = 0;
        int i = 0;
        while (i < s.length()) {
            if (i + 1 < s.length() && s.charAt(i + 1) == 'C') {
                int prev = Character.getNumericValue(s.charAt(i));
                int next = Character.getNumericValue(s.charAt(i + 2));
                result = (prev ^ next);
                i += 3;
            } else if (i + 1 < s.length() && s.charAt(i + 1) == 'A') {
                int prev = Character.getNumericValue(s.charAt(i));
                int next = Character.getNumericValue(s.charAt(i + 2));
                result = (prev & next);
                i += 3;
            } else if (i + 1 < s.length() && s.charAt(i + 1) == 'B') {
                int prev = Character.getNumericValue(s.charAt(i));
                int next = Character.getNumericValue(s.charAt(i + 2));
                result = (prev | next);
                i += 3;
            } else {
                i++;
            }
        }
        return result;
    }
}
