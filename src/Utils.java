/**
 *
 */
public class Utils {

    public static int Fibonacci(int n){
        if (n <= 1){
            return n;
        }
        return Fibonacci(n - 1 ) + Fibonacci(n - 2);
    }

}