/**
 * A utility class that contains incredibly helpful functions
 * @author Daneil Litt
 */
public class Utils {

    /**
     * A function for getting numbers in the Fibonacci sequence
     * @param n The index for the Fibonacci number
     * @return The number at index n in the Fibonacci sequence
     */
    public static int Fibonacci(int n){
        if (n <= 1){
            return n;
        }
        return Fibonacci(n - 1 ) + Fibonacci(n - 2);
    }

}
