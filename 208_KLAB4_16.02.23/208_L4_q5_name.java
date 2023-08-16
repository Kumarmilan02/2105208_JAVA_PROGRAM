/*Write a program in Java that asks the user to enter his/her first name and last
name as input and then print both in one line in the following format: the last
name followed by the first name*/

import java.util.Scanner;

class Name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String firstName = input.next();

        System.out.println("Please enter your last name: ");
        String lastName = input.next();

        System.out.println(lastName + " _" + firstName);
    }
}
