package Array;

import java.util.Arrays;

public class a1_q6_Array_Resize_Array {

    public static void main(String[] args) {
        int[] array = {5,1,2,9,10};
        int[] newArray = resize(array,10);
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] resize(int[] array, int capacity){
        // Create a new array (tempArray) with the desired new capacity
        int[] tempArray = new int[capacity];

        // Loop through the original array and copy each element to the new array
        for(int i = 0; i < array.length; i++){
            tempArray[i] = array[i];
        }
        // Assign the resized array (tempArray) to the original array variable
        array = tempArray;
        return array;
    }
}
