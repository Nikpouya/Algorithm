/**
 * Created by Nikpouya on 5/25/2018.
 */
public class main {
    public static void main(String[] args)
    {
        int var3=0,var5=0,sum=0;
        while (var3+3<1000)
        {
            var3+= 3;
            if(var3%5 !=0)
            sum+=var3;
        }
        while (var5+5<1000)
        {
            var5+= 5;
            sum+=var5;
        }
        System.out.println("result is:" + sum);
    }
}
