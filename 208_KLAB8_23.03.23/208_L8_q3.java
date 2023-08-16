
/*Define an interface with three methods – earnings(), deductions(), and bonus()
and define a Java class Manager which uses this interface without
implementing the bonus() method. Also, define another Java class   Substaff
which extends from the “Manager” class and implements the bonus() method.
Write the complete program to find out the earnings, deductions, and bonus of
a substaff with the basic salary amount entered by the user as per the
following guidelines –
earnings: basic + DA (80% of basic) + HRA (15% of basic)
deduction PF: 12% of basic
Bonus: 50% of basic*/
interface Employee 
{
    double earnings(double basic);
    double deductions(double basic);
    double bonus(double basic);
}

class Manager implements Employee 
{
    //Override
    public double earnings(double basic) 
    {
        double da = 0.8 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }

    //Override
    public double deductions(double basic) 
    {
        double pf = 0.12 * basic;
        return pf;
    }

    public double bonus(double basic)
    {
    	return 0;
    }
    // bonus() method is not implemented in this class
}

class Substaff extends Manager 
{
    //Override
    public double bonus(double basic) 
    {
        double bonus = 0.5 * basic;
        return bonus;
    }
}

class q3 
{
    public static void main(String[] args) 
    {
        Substaff s = new Substaff();

        double basicSalary = 50000;
        double earnings = s.earnings(basicSalary);
        double deductions = s.deductions(basicSalary);
        double bonus = s.bonus(basicSalary);

        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Earnings: " + earnings);
        System.out.println("Deductions: " + deductions);
        System.out.println("Bonus: " + bonus);
    }
}
