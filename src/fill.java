import java.util.Random;

public class fill {
    static Random rnd = new Random();
    public static int[] RandInt (int[] usersArray, int from, int to){
        for (int i = 0; i < usersArray.length; i++) {
            usersArray[i] = (rnd.nextInt((to+1) - from) + from);
        }
        return usersArray;
    }
}
