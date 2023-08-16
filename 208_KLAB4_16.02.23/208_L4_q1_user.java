/*Write a program in java to ask three different users to enter their:
a. Name
b. roll no
c. section,
d. and branch
Followed by printing the details of each user in separate lines.*/

import java.util.Scanner;

class User 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) 
        {
            // Ask for details of user i
            System.out.println("\nEnter details for user " + i + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Roll no: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); // consume the newline character left by nextInt()
            System.out.print("Section: ");
            String section = scanner.nextLine();
            System.out.print("Branch: ");
            String branch = scanner.nextLine();

            // Print the details of user i
            System.out.println("========================");
            System.out.println("\nUser " + i + " Details:");
            System.out.println("Name: " + name);
            System.out.println("Roll no: " + rollNo);
            System.out.println("Section: " + section);
            System.out.println("Branch: " + branch);
        }
    }
}
