import java.util.Scanner;
public class Palindrome
{
    public static Boolean palindrome_check(String x)
    {
        String p="";
        for(int i=x.length()-1;i>=0;i--){
            p+=x.charAt(i);
        }
        if(x.equals(p))
        return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String :");
        String str=s.nextLine();
        String w=str.toUpperCase();
        int n=str.length();
        boolean b=palindrome_check(w);
        if(b==true)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
