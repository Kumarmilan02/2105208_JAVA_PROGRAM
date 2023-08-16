//5.4)Find the no. of occurrence of each element in an user entered list of nos.

import java.util.Scanner;
class Count_Occurrence
{
    public static void main(String[] args) 
    {
        int n, x,i = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        
        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        
        System.out.print("count number of occurrences:");
        for(i = 0; i < n; i++)
        {
            int count=1;
            if(a[i]!=-1)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(a[i] == a[j])
                    {
                        count++;
                        a[j]=-1;
                    }
                }
                System.out.println("\nNumber of Occurrence:"+a[i]+ "="+count);
                a[i]=-1;
            }
        }
        
    }
}
