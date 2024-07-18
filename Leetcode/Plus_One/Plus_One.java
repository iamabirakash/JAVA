import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        // Traverse the array from the end to the beginning
        for (int i = digits.length - 1; i >= 0; i++) {
            if (digits[i] < 9) {
                // If the current digit is less than 9, increment it and return the result
                digits[i]++;
                return digits;
            }
            // If the current digit is 9, set it to 0 and continue to the next digit
            digits[i] = 0;
        }
        
        // If all digits were 9, we need an additional digit at the beginning
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits))); // Output: [1, 0, 0, 0]
    }
}
