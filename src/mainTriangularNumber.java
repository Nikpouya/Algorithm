/**
 * Created by Nikpouya on 5/26/2018.
 */
public class mainTriangularNumber {
    public static void main(String[] arg)
    {
        int sum=0,value=0;
        do {
            value ++;
            sum += value;
            System.out.println(sum);
        }while (!isFound(sum));
        System.out.println("Result is:" + value);
    }

    private static boolean isFound(int number)
    {
        int Mnumber = 0;
        for (int i=1; i<= number; i++)
        {
            if(number%i==0)
                Mnumber++;
        }
        System.out.println("********: " + Mnumber);
        if(Mnumber>500)
            return true;
        else
            return false;
    }
}
