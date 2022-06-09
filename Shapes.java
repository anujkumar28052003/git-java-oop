import java.util.Scanner;
class Square{
    int side;
    int perimeter(){
        int p=4*side;
        return p;
    }
    int area(){
        int a=side*side;
        return a;
    }
}
class Rectangle{

    static int perimeter(int l,int b){
        int  length=l;int breadth=b;
        int p=2*(length+breadth);
        return p;
    }
    /*int area(){
        int a=length*breadth;
        return a;
    }*/
}
class Circle{
    int radius;
    double circumference(){
        double p=radius*2*3.14;
        return p;
    }
    double area(){
        double a=3.14*radius*radius;
        return a;
    }
}
public class Shapes {
    public static void main(String[] args) {
        int length, breadth;
        Scanner s=new Scanner(System.in);
        Square sq=new Square();
        System.out.println("Enter side:");
        sq.side=s.nextInt();
        System.out.println(sq.perimeter());
        System.out.println(sq.area());
        Rectangle rec=new Rectangle();
        System.out.println("Enter length and breadth");
        length=s.nextInt();
        breadth=s.nextInt();
        System.out.println(Rectangle.perimeter(length,breadth));
        //System.out.println(rec.area());
        Circle cir=new Circle();
        System.out.println("Enter radius");
        cir.radius=s.nextInt();
        System.out.println(cir.circumference());
        System.out.println(cir.area());
    }
}
