/**
 * Created by Nikpouya on 5/26/2018.
 */
public class mainTriangularNumber2 {
    public static void main(String[] arg)
    {
        int n = 1;
        int d = 1;

        while (tau(d) <= 500) {
            n++;
            d+= n;
        }
        System.out.println(d);
    }

    public static int tau( int num) {

        int n = num;
        int i = 2;
        int p = 1;

        if (num == 1)
            return 1;

        while (i * i <= n) {
            int c = 1;
            while (n % i == 0) {
                n/= i;
                c++;
            }
            i++;
            p*= c;
        }

        if (n == num || n > 1)
            p*= 1 + 1;

        return p;
    }
}
