import java.util.Scanner;
class function
{
    int f (int i )
    {
        if ( i == 0) return 0;
        if (( i % 2) == 0)
            return f ( i /2) + f ( i /2);
        else return f ( i-1 ) + 1;
    }
}

public class func
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        function obj=new function();
        int c=obj.f(11);
        System.out.println(c);

    }
}
