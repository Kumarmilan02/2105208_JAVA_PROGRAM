/*Write a java program that will perform the dynamic method dispatch using the
display () method defined in a class "Interest" and present the simple interest
and compound interest, as per user choice and user-entered dimensions
[Consider that the rate of interest to be calculated annually with the time
period counted in years].
Dynamic Method Dispatching:- If Same method present in both child and parent class . In main When parent class reference called child class constructor
then child class method called instead of parent class
*/
import java.util.Scanner;

class Interest 
{
    double principle, rate, time;

    public void display() 
    {
        System.out.println("Interest class display method called!");
    }
}

class SimpleInterest extends Interest 
{
    double simpleInterest;

    public void display() 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principle amount: ");
        principle = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        rate = input.nextDouble();

        System.out.print("Enter Time Period in years: ");
        time = input.nextDouble();

        simpleInterest = (principle * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}

class CompoundInterest extends Interest 
{
    double compoundInterest;

    public void display() 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principle amount: ");
        principle = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        rate = input.nextDouble();

        System.out.print("Enter Time Period in years: ");
        time = input.nextDouble();

        compoundInterest = principle * Math.pow((1 + rate / 100), time) - principle;
        System.out.println("Compound Interest: " + compoundInterest);
    }
}

class MainIn 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Interest i;
        int choice=1;
        while(choice!=0)
        {
        	System.out.println("\nEnter ur choice:"+"\n1:-Simple Interest"+"\n2:-Compound Interest"+"\n0:-Stop");
        	choice = input.nextInt();

        	if (choice == 1) 
        	{
            	i = new SimpleInterest();
            	i.display();
        	} 
        	else if (choice == 2) 
        	{
            	i = new CompoundInterest();
            	i.display();
        	} 
        	else 
        	{
            	System.out.println("Invalid choice!");
        	}
        }
    }
}
