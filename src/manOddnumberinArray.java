import java.util.Arrays;

/**
 * Created by Nikpouya on 5/26/2018.
 */
public class manOddnumberinArray {
    public static void main(String[] arg)
    {
        boolean found=false;
        int[] arr={1,2,1,7,2,3,3};
        int selected=0;
        int counter=0;
        if(arr.length!=0)
            Arrays.sort(arr);
        for(int i=0; i<arr.length-1;i++)
        {
            if(arr[i]!=selected)
            {
                if(counter %2 !=0)
                    System.out.println(selected);
                selected = arr[i];
                counter=1;
            }
            else
                counter++;
        }
        System.out.println(arr[arr.length-1]);
    }
}
