/*Write a program in java to Illustrate the usage of abstract classes with the
following Java classes:
a. An abstract class student with data member roll no, reg no, and two
abstract methods course() and branch(). Both abstract methods take a
string parameter as their argument.
b. A subclass Generic with course() and branch() method
implementatiobns
Next, ask a user to input the name of the branch and any subject in that
specific branch. Finally, depending upon the user inputs, the abstract method
implementations must print the details concerning the different branches,
including computer science, electrical engineering, mechanical engineering,
chemical engineering, and civil engineering.*/



import java.util.Scanner;

abstract class Student 
{
    int rollNo;
    int regNo;

    abstract void course(String courseName);
    abstract void branch(String branchName);
}

class Generic extends Student 
{
    //Override
    void course(String courseName) 
    {
        System.out.println("Course Name: " + courseName);
    }

    //Override
    void branch(String branchName) 
    {
        switch (branchName) 
        {
            case "computer science":
                System.out.println("Branch Name: Computer Science");
                System.out.println("Subjects: Data Structures, Algorithms, Programming Languages");
                break;
            case "electrical engineering":
                System.out.println("Branch Name: Electrical Engineering");
                System.out.println("Subjects: Circuits, Power Systems, Control Systems");
                break;
            case "mechanical engineering":
                System.out.println("Branch Name: Mechanical Engineering");
                System.out.println("Subjects: Mechanics, Thermodynamics, Machine Design");
                break;
            case "chemical engineering":
                System.out.println("Branch Name: Chemical Engineering");
                System.out.println("Subjects: Chemical Thermodynamics, Process Control, Transport Phenomena");
                break;
            case "civil engineering":
                System.out.println("Branch Name: Civil Engineering");
                System.out.println("Subjects: Structural Analysis, Concrete Technology, Geotechnical Engineering");
                break;
            default:
                System.out.println("Invalid Branch Name!");
        }
    }
}

class q1
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Branch Name: ");
        String branchName = input.nextLine().toLowerCase();

        System.out.print("Enter Subject Name: ");
        String subjectName = input.nextLine();

        System.out.println();
        System.out.println("=====================================");
        System.out.println();

        Generic obj = new Generic();
        obj.branch(branchName);
        obj.course(subjectName);
    }
}
