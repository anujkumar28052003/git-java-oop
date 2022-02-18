import java.util.Scanner;
import java.lang.*;
public class Quadrilateral {
    public static double ShapeArea(double x,double y)
    {
        double area=x*y;
        return area;
    }
    public static double ShapeArea(double si)
    {
        double area=si*si;
        return area;
    }
    public static double ShapeArea(double q,double w,double t)
    {
        double semi=(q+w+t)/2;
        double area =Math.sqrt(semi*(semi-q)*(semi-w)*(semi-t));
        return area;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 to cal area of rectangle:\nEnter 2 to cal area of square:\nEnter 3 to cal area of triangle:");
        int choice=s.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter length:");
                double l=s.nextDouble();
                System.out.println("Enter breadth:");
                double b=s.nextDouble();
                System.out.println("Area of rectangle : "+ShapeArea(l,b)+" square units.");
            break;
            case 2:
                System.out.println("Enter side:");
                double side=s.nextDouble();
                System.out.println("Area of square : "+ShapeArea(side)+" square units.");
            break;
            case 3:
                System.out.println("Enter side 1:");
                double a1=s.nextDouble();
                System.out.println("Enter side 2:");
                double a2=s.nextDouble();
                System.out.println("Enter side 3:");
                double a3=s.nextDouble();
                System.out.println("Area of triangle : "+ShapeArea(a1,a2,a3)+" square units.");

        }
    }
}
