/*Write a program in java if the number is less than 10 and greater than 50 it
generates the exception out of range. Else it displays the square of the number.*/
import java.util.*;
class NumberChecker 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt(); // Input number to check
        
        try 
        {
            if (number < 10 || number > 50) 
            {
                throw new OutOfRangeException("Number is out of range.");
            } 
            else 
            {
                int square = number * number;
                System.out.println("The square of the number is: " + square);
            }
        } 
        catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}

class OutOfRangeException extends Exception 
{
    public OutOfRangeException(String message) {
        super(message);
    }
}
