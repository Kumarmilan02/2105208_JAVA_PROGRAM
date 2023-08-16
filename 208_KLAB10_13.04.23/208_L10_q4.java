/* Write a java program to check whether a given string is palindrome using
string functions.*/

import java.util.*;
class PalindromeChecker 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String input = sc.nextLine(); // Input string to check
        
        if (isPalindrome(input)) 
        {
            System.out.println("The input string \"" + input + "\" is a palindrome.");
        } 
        else {
            System.out.println("The input string \"" + input + "\" is not a palindrome.");
        }
    }
    
    public static boolean isPalindrome(String str) 
    {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        str = str.replaceAll("\\s+", "").toLowerCase();
        
        // Check if the string is a palindrome
        int left = 0;
        int right = str.length() - 1;
        while (left < right) 
        {
            if (str.charAt(left) != str.charAt(right)) 
            {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // Palindrome
    }
}
