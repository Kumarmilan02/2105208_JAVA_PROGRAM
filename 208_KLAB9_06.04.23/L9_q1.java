/*Write a Java program to generate an ArrayIndexOutofBoundsException and
handle it using a catch statement.
*/
class L9_q1
{
    public static void main(String[] args) 
    {
        int[] numbers = {1, 2, 3, 4, 5};
        try 
        {
            int sixthNumber = numbers[5];
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("ArrayIndex is out of bounds:"+e.getMessage());
        }
    }
}