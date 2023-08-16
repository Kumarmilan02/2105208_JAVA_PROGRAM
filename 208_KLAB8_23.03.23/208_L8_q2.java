/*Define an interface Motor with a data member–capacity and two methods: run
() and consume(). Define a Java class Washing machine which implements
this interface and write the code to check the value of the interface data
member through an object of the class.*/

interface Motor 
{
    int capacity = 5; // interface data member

    void run();
    void consume();
}

class Washing implements Motor 
{
    //Override
    public void run() 
    {
        System.out.println("Washing Machine is running...");
    }


    //Override
    public void consume() 
    {
    	if((capacity>0) && (capacity<30))
    	{
        	System.out.println("Washing Machine is consuming " + capacity + " liters of water per wash.");
    	}
    	else
    		System.out.println("write correct capacity.");
    }
}

class q2
{
    public static void main(String[] args) 
    {
        Washing wm = new Washing();
        wm.run();
        wm.consume();
    }
}
