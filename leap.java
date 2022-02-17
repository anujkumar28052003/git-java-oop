import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter year :");
        int year=s.nextInt();
        if(year%4==0)
        {
            System.out.println("The year is a leap year .");
        }
        else
        {
            System.out.println("The year is not a leap year .");
        }
    }
}
