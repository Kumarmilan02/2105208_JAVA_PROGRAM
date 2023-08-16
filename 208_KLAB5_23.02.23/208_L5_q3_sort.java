//5.3)Program to sort the user entered list of numbers of any size.

import java.util.Arrays;
import java.util.Scanner;

class NumberSorter
{
    public static void main(String[] args) 
    {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("\nSorted array in ascending order : ");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }
}







/*class Number
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a list of numbers separated by spaces: ");
        String input = scanner.nextLine();
        
        String[] numStrings = input.split(" ");
        
        
        int[] numbers = new int[numStrings.length];
        for (int i = 0; i < numStrings.length; i++) 
        {
            numbers[i] = Integer.parseInt(numStrings[i]);
        }
        
        Arrays.sort(numbers);
        
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));
    }
}*/