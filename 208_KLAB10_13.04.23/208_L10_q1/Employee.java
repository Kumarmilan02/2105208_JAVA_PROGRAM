/* Define two packages as – General and Marketing. In General package define a
class employee with data members as empid(protected), ename(private) and
a public method as earnings() which calculate total earnings as
earnings basic + DA (80% of basic) + HRA (15% of basic)
The Marketing package defines a class sales which extends from
employee class and has a method tallowance() which calculates Travelling
Allowance as 5% of total earnings. Write the programs to find out total
earnings of a sales person for the given basic salary amount and print along
with the emp id.*/


//file name must be "Employee.java"
package General;
public class Employee 
{
    protected int empid;
    private String ename;

    public Employee(int empid, String ename) 
    {
        this.empid = empid;
        this.ename = ename;
    }

    public double earnings(double basic) 
    {
        double da = 0.8 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }

    public int getEmpid() 
    {
        return empid;
    }

    public String getEname() 
    {
        return ename;
    }
}
//javac -d . Employee.java