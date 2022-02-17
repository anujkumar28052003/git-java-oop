import java.util.Scanner;
public class Overload
{
    public static int Sumation(int q,int w,int e)
    {
        int r=q+w+e;
        return r;
    }
    public static double Sumation(double q1,double w1,double e1)
    {
        double r1=q1+w1+e1;
        return r1;
    }
    public static int Sumation(int q2,int w2,int e2,int e3)
    {
        int r2=q2+w2+e2+e3;
        return r2;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 to cal sum of three numbers\nEnter 2 to cal sum of three decimal numbers\nEnter 3 to cal sum of four numbers:");
        int n=s.nextInt();
        switch(n)
        {
            case 1:
                System.out.println("Enter three numbers:");
                int a=s.nextInt();
                int b=s.nextInt();
                int c=s.nextInt();
                int sum=Sumation(a,b,c);
                System.out.println("The sum of three numbers :"+sum);
            break;
            case 2:
                System.out.println("Enter three decimal numbers:");
                double i=s.nextDouble();
                double j=s.nextDouble();
                double k=s.nextDouble();
                double sum1=Sumation(i,j,k);
                System.out.println("The sum of three decimal numbers :"+sum1);
            break;
            case 3:
                System.out.println("Enter four integer numbers:");
                int x=s.nextInt();
                int y=s.nextInt();
                int z=s.nextInt();
                int t=s.nextInt();
                int sum2=Sumation(x,y,z,t);
                System.out.println("The sum of four integer :"+sum2);
            break;
            default:
                System.out.println("Invalid choice");
            break;
        }
    }
}