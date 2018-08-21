/**
 * Created by Nikpouya on 5/26/2018.
 */
public class mainArrayRotate {
    public static void main(String[] arg)
    {   int temp = 0;
        int[] arr = {};
        if(arr.length !=0)
            for (int j = 1; j <= 4; j++) {
                temp = arr[arr.length - 1];
                for (int i = arr.length - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = temp;
                temp = 0;
            }
    }
}
