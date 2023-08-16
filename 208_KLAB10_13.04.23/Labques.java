class Labques 
{
    public static void main(String args[]) 
    {
        try 
        {
            int a = args.length;
            int b = 82 / a;
            System.out.println("a= " + a);
            try 
            {
                if (a == 1) 
                {
                    a = a / (a - a);
                }
                if (a == 2) {
                    int c[] = { 1 };
                    c[82] = -999;
                }
            } 
            catch (StringIndexOutOfBoundsException e) 
            {
                System.out.println("SIoob");
            } 
            catch (ArrayIndexOutOfBoundsException e) 
            {
                System.out.println("AIoob");
            } 
            catch (IndexOutOfBoundsException e) 
            {
                System.out.println("Ioob");
            }
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Divide by zero: " + e);
        }
    }
}
