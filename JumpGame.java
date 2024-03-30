public class JumpGame {
    public static void main(String[] args) {
        int[] numbs = {3,2,1,1,4};
        System.out.println(jumpGame(numbs));
    }
    private static boolean jumpGame(int[] numbs) {
        int reachable = 0;
        if(numbs[0]==0)
            return false;
        for (int i = 0; i < numbs.length; i++) {
            if (i > reachable)
                return false;
            reachable = Math.max(reachable, i + numbs[i]);
        }
        return true;
    }
}
