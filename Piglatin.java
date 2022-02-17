import java.util.Scanner;
public class Piglatin
{
    public static void display(String []x)
    {
        int num=x.length;
        String word="";
        for(int h=0;h<num;h++)
        {
            word=x[h];
            char l=word.toLowerCase().charAt(0);
            if(l=='a'||l=='e'||l=='i'||l=='o'||l=='u') //Works for words beginning with vowel
            {
                x[h] = word + "way";
            }
            else
            {
                int num1=word.length();
                int count=0;
                String word2="",word3="";
                for(int b=0;b<num1;b++)  //Used to loop and to obtain each letter in the taken word
                {
                    char ch=word.toLowerCase().charAt(b);
                    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') //Checks whether vowel is present or not
                    {
                        count++;
                    }
                }
                if(count==0) //If vowel is not present
                {
                    x[h]=word+"ay";
                }
                if(count>0) //If vowel is present but doesn't begins with it
                {
                    int num2=0;
                    for(int g=0;g<num1;g++)
                    {
                        char ch1=word.toLowerCase().charAt(g);
                        if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u') {
                            num2 = g;   // position of vowel in the word
                            break;
                        }
                    }
                    word2=word.toLowerCase().substring(0,num2);
                    word3=word.substring(num2,num1);
                    x[h]=word3+word2+"ay";
                }
            }
        }
        String sentence="";
        for(int t=0;t<num;t++){
            sentence+=x[t]+" ";
        }
        int num3=sentence.length();
        char ch2=sentence.toUpperCase().charAt(0);
        sentence=ch2+sentence.substring(1,num3);
        System.out.println("The Piglatin form: \n"+sentence+".");

    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String :");
        String str =s.nextLine();
        int n=str.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)==' ')
              count++;
        }
        String []arr=new String[count+1];
        String w="";int c=0;
        for(int j=0;j<count+1;j++)  //The below method is used to obtain words from the string and to store them in an array.
        {
          for(int k=c;k<n;k++)
          {
              if(str.charAt(k)!=' ') {
                  w += str.charAt(k);
              }
              else {
                  c = k+1;
                  break;
              }
          }
          arr[j]=w;
          w="";
        }
        display(arr);
    }
}
