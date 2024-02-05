
// Requirements
/*
Input: The input is an integer x.
Output: The function should return a boolean value, true if x is a palindrome, and false otherwise.
Palindrome Definition: A palindrome is a number that reads the same backward as forward.
Input Range: The input integer x can be both positive and negative.
Output Range: The output should be a boolean value.
*/

public class palindrome {
    public static boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        int number = 1210121;
        System.out.println(number + " is a palindrome: " + isPalindrome(number));
    }
}


// Estimation - Time complexity would be O(log(n))
// Actual Time Measurement: 30 min