import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by Nikpouya on 5/26/2018.
 */
public class mainTriplet {
    public static void main(String[] arg)
    {
        int[] arr={10,2,5,1,8,20};
        Arrays.sort(arr);

        for(int i=0;i<arr.length-2;i++){
            if(
                    ((long)arr[i] + (long)arr[i+1] > arr[i+2]) &&
                            ((long)arr[i+1] + (long)arr[i+2] > arr[i]) &&
                            ((long)arr[i] + (long)arr[i+2] > arr[i+1])
                    )
                System.out.println(1);
        }
        System.out.println(0);
    }
}
