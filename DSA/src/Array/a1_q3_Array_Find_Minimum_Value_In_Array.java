package Array;

public class a1_q3_Array_Find_Minimum_Value_In_Array {

    public static void main(String[] args) {
        int[] array= {5,9,3,15,1,2};
        int minValue = findMinimum(array);
        System.out.println(minValue);
    }

    public static int findMinimum(int[] array){
        // Initialize minValue with the first element
        int minValue = array[0];

        // Start from the second element, since the first is already set as minValue
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}
