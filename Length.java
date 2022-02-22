import java.util.Scanner;
class Distance
{
    int km;
    int m;
    int cm;
    Distance()
    {}
    Distance(int km,int m,int cm)
    {
        this.km=km;
        this.m=m;
        this.cm=cm;
    }
    public static Distance add(Distance l1,Distance l2)
    {
        Distance v=new Distance();
        v.cm= l1.cm+l2.cm;
        v.m=l1.m+ l2.m;
        if(v.cm>=100)
        {
            v.m++;
            v.cm-=100;
        }
        v.km=l1.km+ l2.km;
        if(v.m>=1000)
        {
            v.km++;
            v.m-=1000;
        }
        return v;
    }
    public void display(){
        System.out.println("Sum of Distances : "+km+ " km "+m+" m "+cm+" cm." );
    }

}
public class Length {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Distance d1=new Distance();
        System.out.println("Enter distance 1:");
        System.out.println("Enter kilometers:");
        d1.km=s.nextInt();
        System.out.println("Enter metres:");
        d1.m=s.nextInt();
        System.out.println("Enter centimetres:");
        d1.cm=s.nextInt();
        System.out.println("Enter distance 2:");
        System.out.println("Enter kilometers:");
        int k2=s.nextInt();
        System.out.println("Enter metres:");
        int m2=s.nextInt();
        System.out.println("Enter centimetres:");
        int c2=s.nextInt();
        Distance d2=new Distance(k2,m2,c2);
        Distance d3=new Distance();
        d3=Distance.add(d1,d2);
        d3.display();
    }
}
