//5.2)Accept 10 numbers from command line and check how many of them are even and how many odd.

class EvenOddCounter 
{
    public static void main(String[] args) 
    {
        int evenCount = 0;
        int oddCount = 0;
        
    
        for (int i = 0; i < 10; i++) 
        {
            int num = Integer.parseInt(args[i]);
            
            if (num % 2 == 0) 
            {
                evenCount++;
            } 
            else 
            {
                oddCount++;
            }
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
