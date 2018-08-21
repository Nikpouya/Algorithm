/**
 * Created by Nikpouya on 5/26/2018.
 */
public class BinaryGap2 {
    public static void main(String[] arq)
    {
        int N= 1041;
        int pre = -1;
        int len = 0;

        while (N > 0) {
            int k = N & -N;

            int curr = (int) Math.log(k);

            N = N & (N - 1);

            if (pre != -1 && Math.abs(curr - pre) > len) {
                len = Math.abs(curr - pre) + 1;
            }
            pre = curr;
        }
        System.out.println("Result: " + len);
    }
}
