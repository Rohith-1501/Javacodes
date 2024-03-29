import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of parameter :");
        int n = sc.nextInt();
        System.out.println(generateParenthesis(n));
    }

    private static List<String> generateParenthesis(int n) {

       List<String> list = new  ArrayList<>() ;

       f(n,"",0,0,list);
       return list;
    }

    private static void f(int n, String s, int open, int close, List<String> list) {

        if(open+close==2*n){
            list.add(s);
            return;
        }
        if (open<n) {
            f(n,s+"(",open+1,close,list);
        }
        if(close<open){
            f(n,s+")",open,close+1,list);
        }
    }
}
