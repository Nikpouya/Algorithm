import java.util.Arrays;

/**
 * Created by Nikpouya on 5/26/2018.
 */
public class DistinctValueinArr {
    public static void main(String[] arg)
    {
        int[] arr={1,2,2};
        int selected=-1;
        int counter =0;
        if(arr.length!=0) {
            Arrays.sort(arr);
            for (int item : arr) {
                if (item != selected) {
                       selected = item;
                    counter ++ ;

                }
            }

        }
        System.out.println(counter);

    }
}
