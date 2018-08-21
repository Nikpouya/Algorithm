/**
 * Created by Nikpouya on 5/26/2018.
 */
public class mainSumSquare {
    public static void main(String[] arg)
    {
        int susq =0, sqsu=0, diff=0;
        for (int i=0 ; i<=100 ; i++)
        {
            susq += i*i;
            sqsu +=i;
        }
        diff = Math.abs(susq - (sqsu*sqsu));
        System.out.println("Result is: " + diff);
    }
}
