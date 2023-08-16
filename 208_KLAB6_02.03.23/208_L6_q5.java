

/*(6.5)Write a program in java to input and display the details of n number of
students having roll, name, and cgpa as data members. Also, display the name
of the student having the lowest cgpa*/

import java.util.Scanner;

class Student 
{
    int roll;
    String name;
    double cgpa;

    void input() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter CGPA: ");
        cgpa = sc.nextDouble();
        System.out.println("=================");
    }

    void display() 
    {
        System.out.println("Roll Number: " + roll);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("=================");
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) 
        {
            System.out.println("\nEnter details for student " + (i+1) + ":");
            students[i] = new Student();
            students[i].input();
        }

        double minCgpa = Double.MAX_VALUE;
        int minIndex = -1;

        System.out.println("\nDetails of all students:");

        for (int i = 0; i < n; i++) 
        {
            System.out.println("Student " + (i+1) + ":");
            students[i].display();

            if (students[i].cgpa < minCgpa) 
            {
                minCgpa = students[i].cgpa;
                minIndex = i;
            }
        }

        System.out.println("\nStudent with lowest CGPA:");
        System.out.println("Name: " + students[minIndex].name);
        System.out.println("CGPA: " + students[minIndex].cgpa);
    }
}
