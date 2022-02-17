import java.util.Scanner;
public class Permutation
{
    static int factn;
    static int factr;
    public static int PermutationCal1(int a)
    {
        // To cal n!
        if(a==0) return 1;
        factn =PermutationCal1(a-1)*a;
        return factn;
    }
    public static int PermutationCal2(int b)
    {
        // To cal (n-r)!
        if(b==0) return 1;
        factr =PermutationCal2(b-1)*b;
        return factr;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n:");
        int n=s.nextInt();
        System.out.println("Enter r:");
        int r=s.nextInt();
        int x=PermutationCal1(n);
        int y=PermutationCal1(n-r);
        System.out.println("Permutaion combination n(P)r :"+(x/y));
    }
}
