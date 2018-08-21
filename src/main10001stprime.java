/**
 * Created by Nikpouya on 5/26/2018.
 */
public class main10001stprime {
    public static void main(String[] arg)
    {
        int counter=0,number=1;
        do {
            number++;
            if(isPrime(number))
                counter++;

        }while (counter<10001);
        System.out.println("Result is: "+ number);
    }

    public static boolean  isPrime(int number)
    {
        for (int i=2; i<= Math.sqrt(number);i++)
        {
            if (number %i ==0)
                return false;
        }
        return true;
    }
}
