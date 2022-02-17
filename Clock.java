import java.util.Scanner;
class Time
{
    int hour,minute,second;
    Time()
    {}
    Time(int x,int y,int z)
    {
        hour=x;
        minute=y;
        second=z;
    }
    void setTime(int a,int b,int c)
    {
        hour=a;
        minute=b;
        second=c;
    }
    void displayTime()
    {
        System.out.println(hour+" : "+minute+" : "+second);
    }
    void addTime(Time one,Time two)
    {
       second=one.second+two.second;
       minute=one.minute+two.minute;
       hour=one.hour+two.hour;
       if(second>=60)
       {
           second-=60;
           minute++;
       }
        if(minute>=60)
        {
            minute-=60;
            hour++;
        }
    }
}
public class Clock
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter hour 1");
        int h1=s.nextInt();
        System.out.println("Enter minute 1");
        int m1=s.nextInt();
        System.out.println("Enter second 1");
        int s1=s.nextInt();
        System.out.println("Enter hour 2");
        int h2=s.nextInt();
        System.out.println("Enter minute 2");
        int m2=s.nextInt();
        System.out.println("Enter second 2");
        int s2=s.nextInt();
        Time T1=new Time(h1,m1,s1);
        Time T2=new Time();
        T2.setTime(h2,m2,s2);
        Time T3=new Time();
        T1.displayTime();
        T2.displayTime();
        T3.addTime(T1,T2);
        System.out.print("The added time : ");
        T3.displayTime();
    }
}
