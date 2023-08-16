/*Write a program in Java that asks as input the marks secured by him/her in
chemistry out of 100. Next, using the marks entered by the user, generate the
corresponding grade of the student using the following chart with the help of
if..else statements in Java.*/

import java.util.Scanner;

class Marks
{
    public static void main(String[] args) 
    {
        double x;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Your Marks in Chemistry Out of Hundred: ");
        x=input.nextDouble();
        if (x>=90.00){
            System.out.println("Your Grade is A- EXCELLENT");
        }
        else if(x<90 && x>=80){
            System.out.println("Your Grade is B- VERY GOOD");
        }
        else if(x<80 && x>=70){
            System.out.println("Your Grade is C- GOOD");
        }
        else if(x<70 && x>=60){
            System.out.println("Your Grade is D-SATISFACTORY");
        }
        else if(x<60 && x>=50){
            System.out.println("Your Grade is E-WORK HARD");
        }
        else if(x<50 && x>=40){
            System.out.println("Your Grade is F-JUST PASSED");
        }
        else if(x<40){
            System.out.println("FAILED");
        }
    }
    
}
