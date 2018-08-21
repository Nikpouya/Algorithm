import java.util.Arrays;

/**
 * Created by Nikpouya on 5/26/2018.
 */
public class mainSummationofprimes2 {
    public static void main(String[] arg)
    {
        int limit = 2000000 ;
        double crosslimit = Math.sqrt(limit);
        boolean sieve[] = new boolean [limit];
        Arrays.fill(sieve,Boolean.FALSE);
        for (int n=4; n<=limit; n+=2)   // mark even numbers > 2
        {

            if(n<limit) {
                System.out.println(n);
                sieve[n] = true;
            }
        }
        for (int n=3; n<= crosslimit; n+=2)
        {
            if (! sieve[n]) // n not marked, hence prime
            {
                for (int m= n*n ; m<= limit; m += 2*n )
                {
                    if(m<limit)
                        sieve[m] = true ;
                }
            }
        }
        int sum = 0;
        for (int n=2 ; n<limit; n++)
        {
            if(! sieve[n])
            {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
