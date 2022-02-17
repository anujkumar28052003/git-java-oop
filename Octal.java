import java.util.Scanner;
import java.lang.*;
class OctalCon
{
    public  void Octalconvert(int b)
    {
        if(b<=0)
            return ;
        Octalconvert(b/8);
        int oct=b%8;
        System.out.print(oct);
    }
}

public class Octal
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        OctalCon obj = new OctalCon();
        System.out.println("Enter number :");
        int n=s.nextInt();
        System.out.println("Octal number");
        int a=Math.abs(n);
        if(a>0)
        obj.Octalconvert(a);
        else
            System.out.println(0);
    }
}
