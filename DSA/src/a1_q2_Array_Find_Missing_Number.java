public class a1_q2_Array_Find_Missing_Number {

    public static void main(String[] args) {
        int[] array = {5,4,2,1,6,3,7};
        int missingNumber = findMissingNumber(array);
        System.out.println(missingNumber);
    }

    public static int findMissingNumber(int[] array){
        // The real length of the array should be 1 more than the full range
        int arrayLength = array.length + 1;

        // Calculate the sum of the first 'n' numbers using the formula: n * (n + 1) / 2
        int sum = (arrayLength*(arrayLength+1))/2;

        // Loop through the array and subtract each element from the calculated su
        for (int num : array) {
            sum -= num;
        }
        // After the loop, the remaining value in 'sum' will be the missing number
        return sum;
    }
}
