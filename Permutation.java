import java.util.Scanner;
public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String To be permuted :");
        String s = sc.nextLine();
        int n = s.length();
        permute(s,0,n-1);
    }
    public static String swap(String s,int i,int j){
        char[] c = s.toCharArray();
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
        return String.valueOf(c);
    }
    public static void permute(String s,int l,int r){
        if(l==r){
            System.out.print(s+" ");
        }
        else{
            for (int i=l;i<=r;i++){
                s=swap(s,l,i);
                permute(s,l+1,r);
                s=swap(s,l,i);
            }
        }
    }
}
