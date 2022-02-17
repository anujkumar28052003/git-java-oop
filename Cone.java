import java.util.Scanner;
class Volume
{
    double height;
    double radius;
    void getdata(double x,double y)
    {
        height=x;
        radius=y;
    }
    double volumecompute()
    {
        double volume=(3.14*height*radius*radius)/3;
        return volume;
    }

}
public class Cone
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Volume v = new Volume();
        System.out.println("Enter height of cone :");
        double h=s.nextFloat();
        System.out.println("Enter radius of base of cone :");
        double r=s.nextFloat();
        v.getdata(h,r);
        double c=v.volumecompute();
        System.out.println("Volume of cone :"+Math.round(c*100)/100.0+" cubic units.");
    }
}
