//2105208_MILAN KUMAR SAHOO
class Num 
{
    int number;
    public Num(int number) 
    {
        this.number = number;
    }
    public void shownum() 
    {
        System.out.println("Number: " + number);
    }
}
class OctNum extends Num 
{
    public OctNum(int number) 
    {
        super(number);
    }
    //Override
    public void shownum() 
    {
        System.out.println("Octal value: " + Integer.toOctalString(number));
    }
}
class Main 
{
    public static void main(String[] args) 
    {
        Num num = new Num(10);
        num.shownum();
        System.out.println();
        OctNum octNum = new OctNum(10);
        octNum.shownum();
    }
}
