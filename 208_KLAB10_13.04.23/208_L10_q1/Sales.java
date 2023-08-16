////file name must be "Sales.java"
package Marketing;
//import General.Employee;
import General.*;

public class Sales extends General.Employee 
{

    public Sales(int empid, String ename) 
    {
        super(empid, ename);
    }

    public double tallowance(double basic) 
    {
        return 0.05 * earnings(basic);
    }
}
//javac -d . Sales.java