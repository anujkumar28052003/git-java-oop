import java.util.Scanner;
public class Malfunc{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String");
        String word=s.next();
        int num=word.length();
        int count=0;
        for(int i=0;i<num-2;i++)
        {
            if(word.charAt(i)==word.charAt(i+1) || word.charAt(i)==word.charAt(i+2))
                count++;
        }
        if(count==0)
            System.out.println("Invalid modified string");
        else
            System.out.println(count);
    }
}

