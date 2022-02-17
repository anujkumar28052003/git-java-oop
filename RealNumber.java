import java.util.Scanner;
class Rational{
    int num1;
    int den1;
    int num2;
    int den2;
    Double rational;
    void addRational(int q,int w,int e,int r)
    {
        num1=q;
        den1=w;
        num2=e;
        den2=r;
        int p=q*r+w*e;
        int t=w*r;
        int gcd2=1;int i=1;
        while(i<=p && i<=t)
        {
            if(p%i==0 && t%i==0)
                gcd2=i;
            i++;
        }
        System.out.println("The addition of rational numbers : "+p+"/"+t);
        System.out.println("The addition of rational numbers in reduced form : "+(p/gcd2)+"/"+(t/gcd2));
        double p1=(double)p/(double)t;
        System.out.println("Added result in double :"+Math.round(p1*1000)/1000.0);
    }
    void multiplyRational()
    {
        int p1=num1*num2;
        int p2=den1*den2;
        int gcd2=1;int i=1;
        while(i<=p1 && i<=p2)
        {
            if(p1%i==0 && p2%i==0)
                gcd2=i;
            i++;
        }
        System.out.println("The product of rational numbers : "+p1+"/"+p2);
        System.out.println("The product of rational numbers in reduced form : "+(p1/gcd2)+"/"+(p2/gcd2));
        double t1=(double)p1/(double)p2;
        System.out.println("Product result in double :"+Math.round(t1*1000)/1000.0);
    }
    double getRational(int x,int y)
    {
        double z=(double)x/(double)y;
        return z;
    }
}
public class RealNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Rational obj=new Rational();
        System.out.println("Enter numerator 1:");
        int n1=s.nextInt();
        System.out.println("Enter denominator 1:");
        int d1=s.nextInt();
        System.out.println("Enter numerator 2:");
        int n2=s.nextInt();
        System.out.println("Enter denominator 2:");
        int d2=s.nextInt();
        if(d1!=0 && d2!=0)
        {
            System.out.println("Fraction 1 = " + n1 + "/" + d1);
            System.out.println("Fraction 2 = " + n2 + "/" + d2);
            int gcd1=1;int i1=1;
            while(i1<=n1 && i1<=d1)
            {
                if(n1%i1==0 && d1%i1==0)
                    gcd1=i1;
                i1++;
            }
            int a=n1/gcd1;
            int b=d1/gcd1;

            int gcd=1;int i2=1;
            while(i2<=n2 && i2<=d2)
            {
                if(n2%i2==0 && d2%i2==0)
                    gcd=i2;
                i2++;
            }
            int c=n2/gcd;
            int d=d2/gcd;
            System.out.println("Rational number 1 = "+a+"/"+b);
            System.out.println("Rational number 2 = "+c+"/"+d);
            System.out.println("Double rational 1= "+Math.round(obj.getRational(a,b)*100)/100.0);
            System.out.println("Double rational 2= "+Math.round(obj.getRational(c,d)*100)/100.0);
            obj.addRational(n1,d1,n2,d2);
            obj.multiplyRational();
        }
        else if(d1==0 && d2==0)
        {
            System.out.println("Rational number 1 = Error :)");
            System.out.println("Rational number 2 = Error :)");
        }
        else if(d1==0 && d2!=0)
        {

            System.out.println("Fraction number 2 = "+n2+"/"+d2);
            int gcd=1;int i1=1;
            while(i1<=n2 && i1<=d2)
            {
                if(n2%i1==0 && d2%i1==0)
                    gcd=i1;
                i1++;
            }
            System.out.println("Rational number 1 = Error :)");
            System.out.println("Rational number 2 = "+(n2/gcd)+"/"+(d2/gcd));
        }
        else if(d1!=0 && d2==0)
        {
            System.out.println("Fraction number 1 = "+n1+"/"+d1);

            int gcd=1;int i1=1;
            while(i1<=n1 && i1<=d1)
            {
                if(n1%i1==0 && d1%i1==0)
                    gcd=i1;
                i1++;
            }
            System.out.println("Rational number 1 = "+(n1/gcd)+"/"+(d1/gcd));
            System.out.println("Rational number 2 = Error :)");
        }
    }
}