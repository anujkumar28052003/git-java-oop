import java.util.Scanner;
public class Area {
    public static double areacircle(double x)
    {
       double ar=3.14*x*x;
       return ar;
    }
    public static double areacircle(int y)
    {
        double ar=3.14*y*y;
        return ar;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 to cal area with double radius and 2 to cal area with integer radius ");
        int choice=s.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter radius");
                double r1=s.nextDouble();
                System.out.println("Area of circle :"+areacircle(r1)+" square units.");
            break;
            case 2:
                System.out.println("Enter radius");
                int r2=s.nextInt();
                System.out.println("Area of circle :"+areacircle(r2)+" square units.");
            break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
