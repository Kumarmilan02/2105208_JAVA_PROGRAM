  /*Write a program in java to create an Account class containing acc_no, balance as data members and disp() to display the details. 
Inherit it in Person class with all mentioned data members and functions. 
Person class also has name and aadhar_no as extra data members of its own. Override disp() function. Create 5 persons‟ details.*/

class Account 
{
    int acc_no;
    double balance;

    public Account(int acc_no, double balance) 
    {
        this.acc_no = acc_no;
        this.balance = balance;
    }

    public void disp() 
    {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account 
{
    String name;
    long aadhar_no;

    public Person(int acc_no, double balance, String name, long aadhar_no) 
    {
        super(acc_no, balance);
        this.name = name;
        this.aadhar_no = aadhar_no;
    }

    public void disp() 
    {
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
        super.disp();
    }
}

class AccountDemo 
{
    public static void main(String[] args) 
    {
        Person p1 = new Person(1234, 50000, "Amogh", 1234567890L);
        Person p2 = new Person(2345, 75000, "Sovan", 2345678901L);
        Person p3 = new Person(3456, 90000, "Milan", 3456789012L);
        Person p4 = new Person(4567, 65000, "Aditya", 4567890123L);
        Person p5 = new Person(5678, 80000, "Pratham", 5678901234L);

        p1.disp();
        System.out.println("================================");

        p2.disp();
        System.out.println("==================================");

        p3.disp();
        System.out.println("=================================");

        p4.disp();
        System.out.println("==================================");

        p5.disp();
        System.out.println("==================================");
    }
}
