import java.util.Scanner;
import java.lang.*;
public class Digitcheck
{
    static boolean check=false;
    public static void digicheck(int x,int y)
    {
        if(x==0)
            return ;
        digicheck(x/10,y);
        int digit=x%10;
        if(digit==y)
            check=true;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number :");
        int n=s.nextInt();
        System.out.println("Enter digit to be checked :");
        int d=s.nextInt();
        n=Math.abs(n);
        digicheck(n,d);
        if(check==true)
            System.out.println("The digit "+d+" is present in the number .");
        else
            System.out.println("The digit "+d+" is not present in the number .");
    }
}
