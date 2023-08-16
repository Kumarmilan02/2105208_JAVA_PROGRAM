/*Write a program to create user-defined exceptions called HrsException,
MinException, and SecException. Create a class Time which contains data
member's hours, minutes, and seconds and throw the user-defined exceptions
if hours (>24 and <0), minutes(> 60 and <0), seconds(> 60 and <0). */

class HrsException extends Exception
{
    private int a;
    HrsException(int num)
    {
        a=num;
    }
    public String toString()
    {
        return "Invalid Hour Value"+a;
    }
}
class MinException extends Exception
{
    private int a;
    MinException(int num)
    {
        a=num;
    }
    public String toString()
    {
        return "Invalid Min Value"+a;
    }
}
class SecException extends Exception
{
    private int a;
    SecException(int num)
    {
        a=num;
    }
    public String toString()
    {
        return "Invalid Second Value"+a;
    }
}
class Time
{
    int hrs;
    int mins;
    int secs;
    Time(int h,int m,int s)
    {
        hrs=h;mins=m;secs=s;
        try
        {
            if(hrs>23 || hrs<0)
            {
                throw new HrsException(hrs);
            }
            if(mins>59||mins<0)
            {
                throw new MinException(mins);
            }
            if(secs>59||secs<0)
            {
                throw new SecException(secs);
            }
        }
        catch(HrsException e)
        {
            System.out.println("\nException:"+e);
        }
        catch(MinException e)
        {
            System.out.println("\nException:"+e);
        }
        catch(SecException e)
        {
            System.out.println("\nException:"+e);
        }
        
    }
}
class L9_q3
{
    public static void main(String[] args)
    {
        Time t1=new Time(34,112,45);
        Time t2=new Time(11,43,65);
    }
}