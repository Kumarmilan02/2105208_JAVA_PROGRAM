/*(6.2) Write a program to overload subtract method with various parameters in a 
class in Java. 
*/

class Sub {
    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    int subtract(int a, int b, int c) {
        return a - b - c;
    }

    long subtract(long a, long b) {
        return a - b;
    }
}

class L6_q2 {
    public static void main(String[] args) 
    {
        Sub math = new Sub();

        int result1 = math.subtract(5, 3);
        System.out.println("5 - 3 = " + result1);

        double result2 = math.subtract(10.5, 4.3);
        System.out.println("10.5 - 4.3 = " + result2);

        int result3 = math.subtract(10, 2, 4);
        System.out.println("10 - 2 - 4 = " + result3);

        long result4 = math.subtract(9234L, 2345L);
        System.out.println("9234 - 2345 = " + result4);
    }
}
