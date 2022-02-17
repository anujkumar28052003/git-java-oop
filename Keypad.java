import java.util.Scanner;
public class Keypad {
    public static void Mapnumber(char [] x)
    {
        char []ran=new char[x.length];
        for(int j=0;j<x.length;j++)
        {
           char c=x[j];
           if(c=='A'||c=='B'||c=='C')
              ran[j]='2';
           else if(c=='D'||c=='E'||c=='F')
               ran[j]='3';
           else if(c=='G'||c=='H'||c=='I')
               ran[j]='4';
           else if(c=='J'||c=='K'||c=='L')
               ran[j]='5';
           else if(c=='M'||c=='N'||c=='O')
               ran[j]='6';
           else if(c=='P'||c=='Q'||c=='R'||c=='S')
               ran[j]='7';
           else if(c=='T'||c=='U'||c=='V')
               ran[j]='8';
           else if(c=='W'||c=='X'||c=='Y'||c=='Z')
               ran[j]='9';
           else
               ran[j]=x[j];
        }
        System.out.println("Letter     "+"Digit");
        for(int k=0;k<x.length;k++)
        {
            System.out.println(" "+x[k]+"           "+ran[k]);
        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String :");
        String str=s.nextLine();
        int n = str.length();
        String w=str.toUpperCase();
        char []arr=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=w.charAt(i);
        }
        Mapnumber(arr);
    }
}
