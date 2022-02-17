import java.util.Scanner;
public class Per {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number between 1 and 100000 :");
        int n = s.nextInt();
        int count=0;
        if(n>=1)
        {
            if(n<=100000)
            {
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        count += i;
                    }
                }
                if (count == 2 * n) {
                    System.out.println("The given number is perfect .");
                } else {
                    System.out.println("The given number is not perfect .");
                }
            }
            else{
                System.out.println("Enter number below or equal to 100000 .");
            }
        }
        else{
            System.out.println("Enter number greater than 0 .");
        }
    }
}

