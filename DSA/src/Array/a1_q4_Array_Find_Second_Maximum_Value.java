package Array;

public class a1_q4_Array_Find_Second_Maximum_Value {
    public static void main(String[] args) {
        int[] array = {12,34,2,34,33,1};
        int secondMax = findSecondMax(array);
        System.out.println(secondMax);
    }

    public static int findSecondMax(int[] array){
        int maxValue = Integer.MIN_VALUE;
        int secondMaxValue = Integer.MIN_VALUE;

        for(int num : array){
            if(num>maxValue){
                // If the new number found is greater than the Max Value, the Second Max value becomes the current max value
                // And num becomes max value
                secondMaxValue = maxValue;
                maxValue = num;
            } else if (num>secondMaxValue && num != maxValue) {
                //If the new number is greater than secondMaxValue but is not equal to the maxValue
                //Then the second max value is the new number found
                secondMaxValue = num;
            }
        }
        return secondMaxValue;

    }
}
