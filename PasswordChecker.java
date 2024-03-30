import java.util.Scanner;
public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s2 = "Enter";
        System.out.print("Type Enter :");
        String s1 = sc.nextLine();
        while (s2.equals(s1)) {
            System.out.print("Enter the password:");
            String password = sc.nextLine();
            boolean isValid = checker(password);
            if (isValid) {
                System.out.println("The password is valid");
            } else {
                System.out.println("The password is invalid");
            }

        }
    }

    /*
    – At least 4 characters
    – At least one numeric digit
    – At least one Capital Letter
    – Must not have space or slash (/)
    – Starting character must not be a number
    */
    private static boolean checker(String s) {
        int n = s.length();
        if (n < 4)
            return false;
        if (s.charAt(0) >= '0' && s.charAt(0) <= '9')
            return false;
        boolean hasNumericDigit = false;
        boolean hasCapitalLetter = false;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == ' ' || ch == '/')
                return false;
            if (Character.isDigit(ch))
                hasNumericDigit = true;
            if (Character.isUpperCase(ch))
                hasCapitalLetter = true;
        }
        return hasNumericDigit && hasCapitalLetter;
    }
}
