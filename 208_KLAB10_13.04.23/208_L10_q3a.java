import java.util.Scanner;

class StringOperations 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first string
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        // Input second string
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        System.out.println("----- String Operations -----");
        System.out.println("1. Change case of string");
        System.out.println("2. Reverse string");
        System.out.println("3. Compare two strings");
        System.out.println("4. Insert one string into another string");
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Change case of string
                System.out.println("1. Change case of string");
                System.out.println("String 1 in uppercase: " + str1.toUpperCase());
                System.out.println("String 1 in lowercase: " + str1.toLowerCase());
                System.out.println("String 2 in uppercase: " + str2.toUpperCase());
                System.out.println("String 2 in lowercase: " + str2.toLowerCase());
                break;
            case 2:
                // Reverse string
                System.out.println("2. Reverse string");
                System.out.println("String 1 reversed: " + reverseString(str1));
                System.out.println("String 2 reversed: " + reverseString(str2));
                break;
            case 3:
                // Compare two strings
                System.out.println("3. Compare two strings");
                int result = str1.compareTo(str2);
                if (result == 0) {
                    System.out.println("String 1 is equal to String 2");
                } else if (result < 0) {
                    System.out.println("String 1 is lexicographically smaller than String 2");
                } else {
                    System.out.println("String 1 is lexicographically larger than String 2");
                }
                break;
            case 4:
                // Insert one string into another string
                System.out.println("4. Insert one string into another string");
                System.out.print("Enter the index at which you want to insert string 2 into string 1: ");
                int index = scanner.nextInt();
                String insertedString = insertString(str1, str2, index);
                System.out.println("String 2 inserted into String 1: " + insertedString);
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                break;
        }

        scanner.close();
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    // Method to insert one string into another string
    public static String insertString(String str1, String str2, int index) {
        StringBuilder insertedString = new StringBuilder(str1);
        insertedString.insert(index, str2);
        return insertedString.toString();
    }
}
