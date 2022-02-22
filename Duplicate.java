import java.util.Scanner;
public class Duplicate {
    public static int find_length(int []x)
    {
        int num=x.length;
        int cout=0;int c=1;
        for(int a=0;a<num;a++)
        {
            for(int b=a+1;b<num;b++)
            {
                if(x[a]>x[b])
                {
                   cout=x[a];
                   x[a]=x[b];
                   x[b]=cout;
                }
            }
        }
        for(int j=0;j<num-1;j++)
        {
            if(x[j]!=x[j+1])
                c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements :");
        int n = s.nextInt();
        int []a=new int[n];
        System.out.println("Enter elements :");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("The new length of array :"+find_length(a));
    }
}
