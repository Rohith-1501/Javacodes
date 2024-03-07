import java.util.Scanner;
public class StrStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First String: ");
        String s1 =sc.next();
        System.out.print("Enter the second string: ");
        String s2 =sc.next();
        System.out.println("Your substring starts from the index of:"+strStr(s1,s2));
    }
    private static int strStr(String s1, String s2) {
        int count = 0;
        int index=-1;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(0)){
                for (int j=i;j<i+s2.length();j++) {
                    for (int k = 0; k < s2.length(); k++) {
                        if (s1.charAt(i) == s2.charAt(k)){
                            count++;
                        }
                    }
                }
            }
            if(count==s2.length()){
                index=i;
                break;
            }
        }
        return index;
    }
}
