import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String 1: ");
        String s1 = sc.next();
        System.out.print("String 2: ");
        String s2 =  sc.next();
        System.out.println(removeChar(s1,s2));
    }

    private static String removeChar(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            boolean found = false;
            for (int j=0;j<s2.length();j++){
                if(c==s2.charAt(j)){
                    found =true;
                    break;
                }
            }
            if(!found){
                result.append(c);
            }
        }
     return result.toString();
    }
}
