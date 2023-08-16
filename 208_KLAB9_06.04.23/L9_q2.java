/*Write a Java class that has a method called ProcessInput(). This method
checks the number entered by the user. If the entered number is negative, then
throw a user-defined exception called NegativeNumberException; otherwise,
it displays the double value of the entered number.*/

import java.util.*;
class L9_q2
{
    // Method to process input and check for negative numbers
    public void processInput(int number) throws NegativeNumberException 
    {
        if (number < 0) 
        {
            throw new NegativeNumberException("Negative numbers are not allowed.");
        } 
        else 
        {
            double doubleValue = (double) number * 2;
            System.out.println("Double value of entered number: " + doubleValue);
        }
    }

    // Custom exception class for negative numbers
    public static class NegativeNumberException extends Exception //nexted class
    {
        public NegativeNumberException(String message) 
        {
            super(message);
        }
    }

    public static void main(String[] args) 
    {
        L9_q2 numberProcessor = new L9_q2();
        try 
        {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter integer value: "); 
			int inputNumber = sc.nextInt(); // Example input from user
            numberProcessor.processInput(inputNumber);
        } 
        catch (NegativeNumberException e) 
        {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
