/**
 * Created by Nikpouya on 5/26/2018.
 */
public class mainPythagoreantriplet {
    public static void main(String[] arg)
    {
        int sum = 1000, c=0,p=0;
        for (int a=1; a<= sum/3; a++)
        {
            for (int b= a+1; b<= sum/2; b++)
            {
                c= sum -a-b;
                if (c*c == a*a+b*b) {
                    p = a*b*c;
                    System.out.println("Result is: " + p);
                }
                }
        }
    }
}
