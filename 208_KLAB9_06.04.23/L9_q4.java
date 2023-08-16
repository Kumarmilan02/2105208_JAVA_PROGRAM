/*Create a user-defined exception named Check Argument to check the number
of arguments passed through the command line. If the number of arguments is
less than four, throw the CheckArgument exception; else, print the addition of
squares of all four elements.*/
class ArgumentAddition 
{
    public static void main(String[] args) 
    {
        try 
        {
            if (args.length < 4) 
            {
                throw new CheckArgumentException("Less than four arguments passed.");
            } 
            else 
            {
                int arg1 = Integer.parseInt(args[0]);
                int arg2 = Integer.parseInt(args[1]);
                int arg3 = Integer.parseInt(args[2]);
                int arg4 = Integer.parseInt(args[3]);

                int sumOfSquares = arg1 * arg1 + arg2 * arg2 + arg3 * arg3 + arg4 * arg4;
                System.out.println("Addition of squares of all four elements: " + sumOfSquares);
            }
        } 
        catch (CheckArgumentException e) 
        {
            System.out.println("Exception: " + e.getMessage());
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Exception: Invalid argument(s) passed. Please provide integer values only.");
        }
    }
}

// Custom exception class
class CheckArgumentException extends Exception 

{
    public CheckArgumentException(String message) 
    {
        super(message);
    }
}
