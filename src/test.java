import java.util.HashSet;

/**
 * Created by Nikpouya on 5/27/2018.
 */
public class test {
    public static void main(String[] arg)
    {
        int[] A={2,3,1,5};
        int counter=1;
        HashSet<Integer> HA = new HashSet<Integer>();

        for (int elemnt:A)
        {
            HA.add(elemnt);
        }
        while (HA.contains(counter))
        {
            counter++;
        }
        System.out.println(counter);

    }
}
