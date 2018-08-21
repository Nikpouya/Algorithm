import java.util.Arrays;

/**
 * Created by Nikpouya on 5/26/2018.
 */
public class BinaryGap {
    public static void main(String[] arq)
    {
        int sum=0,maxsum=0, oneCounter=0;
        String biChar = Integer.toBinaryString(1041);
        char[] Chars = biChar.toCharArray();
        for (char ch : Chars)
        {
            if(ch =='1') {
                oneCounter++;
                if (oneCounter>1)
                {
                    if(maxsum<sum)
                        maxsum= sum;
                    oneCounter--;
                    sum =0;
                }
            }
            else
            {
                sum++;
            }
        }
        System.out.println("Result: " + maxsum);
    }
}
