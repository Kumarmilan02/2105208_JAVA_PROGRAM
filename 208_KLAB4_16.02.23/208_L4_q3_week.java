/* Using switch..case statement in Java, write a program to print the corresponding
weekday after asking the user first to enter a valid day number of the current
month
*/
import java.util.Scanner;
class Week
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a valid day number of the current month: ");

        int dayNumber = input.nextInt();
        /*String weekday;
        if(dayNumber<0 || dayNumber>6)
        {
            System.out.println("Invalid weekday number.");
             System.exit(0);
          }*/
        switch (dayNumber %7)
        {
             case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednessday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saterday");
                break;
            default:
                System.out.println("Invalid day number");
                break;
        }
    }
}