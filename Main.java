
import java.util.Scanner;

class InvalidInputNumberException extends Exception {
    public InvalidInputNumberException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = scan.nextInt();
        try {
            meth(num, 1); // Calculate factorial sum
            meth(num, 2); // Generate Fibonacci series
            meth(num, 3); // Generate geometric progression
            meth(num); // Check if palindrome or prime
        } catch (InvalidInputNumberException e) {
            System.out.println("\nCaught InvalidInputNumberException");
            String message = e.getMessage();
            for (int i = 0; i < message.length(); i++) {
                if (i % 2 == 0) {
                    System.out.print(Character.toLowerCase(message.charAt(i)));
                } else {
                    System.out.print(Character.toUpperCase(message.charAt(i)));
                }
            }
            System.out.println();
        }
    }

    public static void meth(int num, int option) throws InvalidInputNumberException {
        if (num < 0) {
            throw new InvalidInputNumberException("Invalid number: " + num);
        }
        if (option == 1) {
            // Calculate factorial sum
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                int fact = 1;
                for (int i = 1; i <= digit; i++) {
                    fact *= i;
                }
                sum += fact;
                num /= 10;
            }
            System.out.println("Factorial sum: " + sum);
        } else if (option == 2) {
            // Generate Fibonacci series
            int a = num, b = num + 1;
            System.out.print("Fibonacci series: " + a + " " + b + " ");
            int c;
            for (int i = 3; i <= 10; i++) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
            System.out.println();
        } else if (option == 3) {
            // Generate geometric progression
            int r = 3;
            System.out.print("Geometric progression: " + num + " ");
            int term = num;
            for (int i = 2; i <= 10; i++) {
                term *= r;
                System.out.print(term + " ");
            }
            System.out.println();
        }
    }

    public static void meth(int num) throws InvalidInputNumberException {
        if (num < 0) {
            throw new InvalidInputNumberException("Invalid number: " + num);
        }
        // Check if palindrome
        String str = Integer.toString(num);
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("\nPalindrome spotted: " + num);
        }
        // Check if prime
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) 
        {
            System.out.println("\nPrime number spotted: " + num);
        }
        else
        {
            System.out.println("\nNot Prime number spotted ");
        }
    }
}