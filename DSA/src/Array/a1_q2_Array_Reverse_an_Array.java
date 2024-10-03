package Array;

import java.util.Arrays;

public class a1_q2_Array_Reverse_an_Array {

    public static void main(String[] args) {
        int[] originalArray = new int[]{2, 11, 5, 10, 7, 8};
        int[] reversedArray = reverseArray(originalArray);;

        System.out.println(Arrays.toString(reversedArray));
    }

    public static int[] reverseArray(int[] originalArray) {

        int arrayLength = originalArray.length;

        // Iterate only halfway through the array
        for (int i = 0; i < arrayLength / 2; i++) {
            // Swap elements from the front and back of the array
            int temp = originalArray[i];
            originalArray[i] = originalArray[arrayLength - 1 - i];
            originalArray[arrayLength - 1 - i] = temp;
        }

        return originalArray;
    }
}
