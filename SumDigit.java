import java.util.Scanner;
import java.lang.*;
class Number
{
    int sum_digit(int n,int k)
    {
         int count=0;
         for(int j=0;j<=k;j++)
         {
           count +=n%10;
           n=n/10;
         }
      return count;
    }
}
public class SumDigit
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Number obj=new Number();
        System.out.println("Enter number :");
        int num=s.nextInt();
        num=Math.abs(num);
        System.out.println("Enter digit index :");
        int i=s.nextInt();
        System.out.println("The sum of digits upto "+i+"th index :"+obj.sum_digit(num,i));
    }
}
