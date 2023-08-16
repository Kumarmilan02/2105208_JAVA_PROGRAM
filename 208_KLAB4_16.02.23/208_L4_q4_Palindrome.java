/*Write a program in Java that first asks the user to input any number, followed by
checking if the number entered by the user is a palindrome or not. If the number is
a palindrome, then output the message Palindrome successfully detected or else
The input number is not a palindromeon the console
*/

import java.util.Scanner;

class Palindrome
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    int number, reversedNumber = 0, remainder, originalNumber;

    System.out.print("Enter a number: ");
    number = input.nextInt();
    originalNumber = number;

    while (number != 0) 
    {
      remainder = number % 10;
      reversedNumber = reversedNumber * 10 + remainder;
      number /= 10;
    }

    if (originalNumber == reversedNumber) 
    {
      System.out.println("Palindrome successfully detected");
    } 
    else 
    {
      System.out.println("The input number is not a palindrome");
    }
  }
}
