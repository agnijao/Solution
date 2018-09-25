
import java.util.Scanner;
import java.io.*;
public class Solution
{

    public static void main(String[]args)
    {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a long number: ");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(br.readLine());
            long sum = superDigit(number);
            System.out.println("Sum of " + number + " Numbers using Recursion is : " + sum);
        }
        catch (Exception e)
        {
            System.out.println ("Give Proper Input i.e. Enter Numeric value only and with in range");
        }
    }


    static long superDigit(long x)
    {
       if(x<10){
           return x;
       }else{
           int sum=0;
           while(x!=0){
               sum+=x%10;
               x/=10;
           }
           return superDigit(sum);
       }
    }

}