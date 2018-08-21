/**
 * Created by Nikpouya on 5/25/2018.
 */
public class mainPalindromic {
    public static void main(String[] args)
    {
        boolean found=false;
        int result=0;
        for(int i=999; i>1; i--)
        {
            for(int j=999;j>1;j--)
            {
                found = findP(i*j);
                if(found)
                {
                  if (i*j >result)
                      result=i*j;

                }
            }
        }
        System.out.println("Result is: " + result);
    }

    public static boolean findP(int palindrome)
    {
        int P= palindrome;
        int reverse=0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if(P == reverse)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
