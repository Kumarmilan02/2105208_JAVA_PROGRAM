//5.1)Find the largest among 3 user entered nos. at the command prompt using Java

class LargestNumber 
{
    public static void main(String[] args) 
    {
        
        if (args.length != 3) 
        {
            System.out.println("Error: Please enter exactly 3 numbers as command-line arguments.");
            return;
        }
        
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        

        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        

        System.out.println("The largest number among the input integers is: " + max);
    }
}
