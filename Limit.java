import java.util.Scanner;
public class Limit
{
    public static void Print(int x,int y)
    {
      if(x==0) return ;
      Print(x-1,y);
        System.out.print(x*x+" ");

    }
    public static void main(String[] args)
    {
       Scanner s = new Scanner(System.in);
        System.out.println("Enter power :");
        int p=s.nextInt();
        System.out.println("Enter limit :");
        int l=s.nextInt();
        if(l>0)
        Print(l,p);
        else
        System.out.println(0);
    }
}
