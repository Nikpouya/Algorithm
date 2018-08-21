/**
 * Created by Nikpouya on 5/26/2018.
 */
public class mainSmallestMultiple {
    public static void main(String[] arg)
    {
        int counter= 2519;
        do {
            counter++;
        }while (!isFound(counter));
    }

    public static boolean isFound(int number)
    {
        for (int i=1;i<=20;i++)
        {
            if (number % i !=0)
                return false;
        }
        System.out.println("Result is: " + number);
        return true;
    }
}
