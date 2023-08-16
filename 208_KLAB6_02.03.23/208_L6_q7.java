/*(6.7)Write a program in Java to define a class Number with appropriate data
members and member functions to input n number of integers and swap the
biggest and smallest elements. Use member functions read(), swap(), and
display().*/

import java.util.Scanner;

class Number 
{
    int[] nums;
    int n;

    void read() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        n = sc.nextInt();
        nums = new int[n];
        System.out.print("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }
    }

    void swap() 
    {
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < n; i++) 
        {
            if (nums[i] > nums[maxIndex]) 
            {
                maxIndex = i;
            }
            if (nums[i] < nums[minIndex]) 
            {
                minIndex = i;
            }
        }

        int temp = nums[maxIndex];
        nums[maxIndex] = nums[minIndex];
        nums[minIndex] = temp;
    }

    void display() 
    {
        System.out.print("Swapped array: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        Number num = new Number();
        num.read();
        num.swap();
        num.display();
    }
}
