import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String [] args) {

        //Generate Random Array
        int size = 10;
        int[] Array = new int[size];
        Random random = new Random();

        for(int i = 0; i < Array.length; i++){
            Array[i] = random.nextInt(size * 10);
        }

        //Bubble Sort
        for(int ph = 0; ph < Array.length; ph++ ) {
            int count = 0;
            System.out.println("Start of loop index " + ph + ", Array order is " + Arrays.toString(Array));

            for (int i = 0, j = 1; j < Array.length; i++, j++) {
                System.out.println("Comparing i = " + Array[i] + " and j = " + Array[j]);
                if (Array[i] > Array[j]) {
                    int temp = Array[j];
                    Array[j] = Array[i];
                    Array[i] = temp;
                    System.out.println("swap");
                } else {
                    System.out.println("No Swap");
                    count++;
                    System.out.println("Count is " + count);
                }
            }

            if(count == Array.length - 1){
                System.out.println("Finished sorting!");
                break;
            }
        }
        System.out.println(Arrays.toString(Array));
    }
}
