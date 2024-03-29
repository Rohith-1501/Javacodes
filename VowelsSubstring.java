import java.util.Scanner;
public class VowelsSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :");
        String s  = sc.nextLine();
        System.out.print("Enter the length of the substring:");
        int n = sc.nextInt();
        System.out.println("Maximum Number of Vowels in a Substring of Given Length: "+vowelSubstring(s,n));
    }
    private static int vowelSubstring(String s, int n) {

        int vowelcount = 0;
        int maxcount =0;
        for(int i=0;i<n;i++){
            if(isVowel(s.charAt(i))){
                vowelcount++;
            }

        }
        maxcount = vowelcount;
       for (int i=n;i<s.length();i++){
           if(isVowel(s.charAt(i-n))){
               vowelcount--;
           }
           if (isVowel(s.charAt(i))){
               vowelcount++;
           }
           maxcount = Math.max(vowelcount,maxcount);
       }

       return maxcount ;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
