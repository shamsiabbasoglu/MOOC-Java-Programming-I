
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        MainProgram.sort(array);
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            smallest = Math.min(smallest, array[i]);
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int smallest = array[index];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int index = startIndex;
        int smallest = array[index];
        for (int i = startIndex; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int index3 = array[index1];
        array[index1] = array[index2];
        array[index2] = index3;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[indexOfSmallestFrom(array, i)]) {
                MainProgram.swap(array, indexOfSmallestFrom(array, i), i);
                System.out.println(Arrays.toString(array));
            }
        }
    }
}
