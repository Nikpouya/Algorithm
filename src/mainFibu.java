/**
 * Created by Nikpouya on 5/25/2018.
 */
public class mainFibu {
    public static void main(String[] arq)
    {
        int var1=1,var2=2,sum=0,finalsum=0;
        do {

            sum= var1+var2;
            if(sum % 2==0)
                finalsum+=sum;
            var1=var2;
            var2=sum;
        }while (var2+var1<=4000000);
        System.out.println(sum);
    System.out.println("Result is: " + finalsum);
    }
}
