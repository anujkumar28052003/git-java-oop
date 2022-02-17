import java.util.Scanner;
public class Recursefact
{
    public static int fact(int n)
    {
        int factorial;
        if(n==0) {
            return 1;
        }
        factorial=n*fact(n-1);
        System.out.println(factorial);
        return factorial;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number=s.nextInt();
        System.out.println("All factorial of numbers upto "+number+" :");
        System.out.println(1);
        fact(number);
    }
}
