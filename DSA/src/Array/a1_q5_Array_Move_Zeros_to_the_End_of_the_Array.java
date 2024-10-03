package Array;

import java.util.Arrays;

public class a1_q5_Array_Move_Zeros_to_the_End_of_the_Array {

    public static void main(String[] args) {
        int[] array = {8,1,0,2,1,0,3};
        int[] newArray = moveZerosToEnd(array);
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] moveZerosToEnd(int[] array){

        // 'j' is the index that tracks where the next non-zero element should be placed
        int j = 0;
        for(int i = 0; i<array.length; i++){
            // Check if the current element is non-zero and the element at 'j' is zero
            // This ensures that we only swap when necessary
            if(array[i] != 0 && array[j]==0){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            if(array[j]!=0){
                j++;
            }
        }
        return array;
    }
}
