public class a1_q7_Array_Check_if_Given_String_is_Palindrome {
    public static void main(String[] args) {
        String word = "madam";
        boolean palindrome = isPalindrome(word);
        System.out.println(palindrome);

    }

    public static boolean isPalindrome(String word){
        char[] charArray = word.toCharArray();

        int arrayLength = charArray.length;

        // Loop through half of the array (since comparing pairs from the start and end)
        for (int i = 0; i< arrayLength/2; i++){

            // Compare the character at position 'i' with the character at the mirror position 'arrayLength-1-i'
            // If they are not equal, the string is not a palindrome
            if(charArray[i]!=charArray[arrayLength-1-i]){
                return false;
            }
        }
        // If the loop completes without finding any mismatches, the string is a palindrome
        return true;
    }
}
