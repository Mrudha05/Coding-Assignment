import java.util.Arrays;
import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};

        // Shuffle
        shuffleArray(originalArray);

        // Print 
        System.out.println("Shuffled Array: " + Arrays.toString(originalArray));
    }

    // Fisher-Yates shuffle algorithm
    static void shuffleArray(int[] array) {
        int n = array.length;
        Random r = new Random();
        for (int i = n - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int rIndex = r.nextInt(i + 1);
            
            // Swap array[i] with the element at randomIndex
            int temp = array[i];
            array[i] = array[rIndex];
            array[rIndex] = temp;
        }
    }
}
