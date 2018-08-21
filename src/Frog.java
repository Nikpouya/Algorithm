/**
 * Created by Nikpouya on 5/27/2018.
 */
public class Frog {
    public static void main(String[] arg)
    {
        int X=2,Y=11,D=3,counter=0;
        counter = (Y-X)/D;
        if((Y-X)%D!=0)
            counter++;
        System.out.println(counter);
    }
}
