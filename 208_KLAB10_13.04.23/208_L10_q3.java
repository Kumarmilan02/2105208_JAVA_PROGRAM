/*Write a program to perform following operations on user entered strings –
i) Change the case of the string
ii) Reverse the string
iii) Compare two strings
iv) Insert one string into another string
*/

import java.util.Scanner;

 class StringOperations 
 {
    
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        
        // (a) Reverse a string
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        System.out.println("===============================================");
        System.out.println("\n1.Change case of string");
        System.out.println("String  in uppercase: " + str.toUpperCase());
        System.out.println("String  in lowercase: " + str.toLowerCase());
         
        System.out.println("==============================================");
        System.out.println("\n2.Reverse The String");
        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
    
        System.out.println("==================================================");
        System.out.println("\n3.Compare two strings");
        System.out.print("Enter the string to compare: ");
        String str1 = input.nextLine();
        boolean isEqual = compareStrings(str, str1);
        if(isEqual) 
        {
            System.out.println("The two strings are equal.");
        }
        else 
        {
            System.out.println("The two strings are not equal.");
        }
        
        System.out.println("==================================================");
        System.out.println("\n4.Insert one string into another string"); 
        System.out.print("Enter a string to insert: ");
        String toInsert = input.nextLine();
        System.out.print("Enter the index to insert at: ");
        int index = input.nextInt();
        String insertedString = insertString(str, toInsert, index);
        System.out.println("Resulting string: " + insertedString);
        
        input.close();
    }
    
    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
    
    // Method to compare two strings
    public static boolean compareStrings(String str, String str1) 
    {
        return str.equals(str1);
    }
    
    // Method to insert one string into another string
    public static String insertString(String str, String toInsert, int index) 
    {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(index, toInsert);
        return sb.toString();
    }
}