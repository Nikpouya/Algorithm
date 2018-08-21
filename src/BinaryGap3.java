/**
 * Created by Nikpouya on 5/26/2018.
 */
public class BinaryGap3 {
    public static void main(String[] arq)
    {
        int N=1041;
        int max = 0;
        int count = -1;
        int r = 0;

        while (N > 0) {
            // get right most bit & shift right
            r = N & 1;
            System.out.println(Integer.toBinaryString(N));
            System.out.println(Integer.toBinaryString(r));
            N = N >> 1;

            if (0 == r && count >= 0) {
                count++;
            }

            if (1 == r) {
                max = count > max ? count : max;
                count = 0;
            }
        }

        System.out.println("Result: " + max);
    }
}
