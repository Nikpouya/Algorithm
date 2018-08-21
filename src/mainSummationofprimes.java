/**
 * Created by Nikpouya on 5/26/2018.
 */
public class mainSummationofprimes {
    public static void main(String[] arg)
    {
        int sum =0;
        for (int i=2; i<2000000; i++)
        {
            System.out.println(i);
            if (isPrime(i))
                sum += i;
        }
        System.out.println("Result is: " + sum);
    }

    public static boolean isPrime(int number)
    {
        for (int i= 2; i<= Math.sqrt(number); i++)
        {
            if (number % i ==0)
                return false;
        }
        return true;
    }
}
