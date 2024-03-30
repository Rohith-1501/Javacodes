public class MinimumJumps {
    public static void main(String[] args) {
        int [] num ={3,4,5,2,3,1,4,2};
        System.out.println();
        System.out.println("Minimum jumps required to reach the end is "+jump(num));
    }
    private static int jump(int[] num) {
        int farthest = 0;
        int jumps = 0;
        int current =0;

        if(num[0]==0)
            return 0;

        for (int i=0;i<num.length-1;i++){
            farthest = max(farthest,i+num[i]);
            if(i==current){
                current=farthest;
                jumps++;
            }
        }
        return jumps;
    }

    private static int max(int farthest, int i) {
        if(farthest>i){
            return farthest;
        }
        else{
            return i;
        }
    }
}
