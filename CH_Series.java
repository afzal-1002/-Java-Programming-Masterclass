public class CH_Series {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println( "Sum of nSum is " + Series.nSum(i));
        }
        for (int i = 0; i <=10; i++) {
            System.out.println( "Factorial is " + Series.factorial(i));
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println("fibonacci is " + Series.fibonacci(i));
        }

    }


}

class Series{

    public int publicVar =0;
    private int privateVar = 1;
    int defaultVar = 2;
    protected  int protectedVar = 3;


    public static int nSum(int n){
         return (n * (n+1)) / 2;
     }

    public static int factorial(int n){
        int fact = 1;
        if(n == 0){
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int fibonacci(int n){
        int fib = 1;
        if (n==0 ){
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int nMinus1 = 1;
        int nMinus2 = 0;

        for (int i = 1; i <= n; i++) {
            fib = nMinus2 + nMinus1;
            nMinus1 = fib;
        }

        return fib;
    }
}
