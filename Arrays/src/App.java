
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
    
        int[] array = new int[] {1,2,3,4,5};
        int temp = array[0];
        array[0] = array[4];
        array[4] = temp;
        System.out.println(Arrays.toString(array));

        System.out.println(array[array.length/2]+array[array.length-5]);
        
    }
}
