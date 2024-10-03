public class q1_Array_Remove_Even_Integers {

    public static void main(String[] args) {
        int[] originalArray = {3, 2, 4, 7, 10, 6, 5};
        int[] filteredArray = removeEvenIntegers(originalArray);
        System.out.println(java.util.Arrays.toString(filteredArray));
    }

    public static int[] removeEvenIntegers(int[] array) {

        int oddCount = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }

        int[] oddArray = new int[oddCount];
        int index = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                oddArray[index++] = num;
            }
        }

        return oddArray;
    }
}
