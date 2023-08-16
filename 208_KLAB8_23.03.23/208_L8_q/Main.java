//file name must be "Main.java"
import Marketing.Sales;
import General.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Sales sale = new Sales(208,"Milan");

        double basic = 50000.0;

        double totalEarnings = sale.earnings(basic);
        double travellingAllowance = sale.tallowance(basic);

        System.out.println("======================================");
        System.out.println("Emp ID: " + sale.getEmpid());
        System.out.println("Emp Name: " + sale.getEname());
        System.out.println("Total Earnings: " + totalEarnings);
        System.out.println("Travelling Allowance: " + travellingAllowance);
    }
}
