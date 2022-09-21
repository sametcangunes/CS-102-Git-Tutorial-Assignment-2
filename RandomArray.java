import java.util.Random;

public class RandomArray {

    public static int[] RandomArray(int n){

        int[] randomNumbers = new Random().ints(n, 0, 100).toArray();
        return randomNumbers;
    }
}
