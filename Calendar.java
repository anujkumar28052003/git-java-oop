import java.util.Scanner;
class Date
{
    int day;
    int month;
    int year;
    String month1;
    void createDate(int x,int y,int z)
    {
        day=x;
        month=y;
        year=z;
    }
    void modify(int q,int w,int e)
    {
        year=year+e;
        day=day+q;

         if(month==2)
         {
             if(year%100!=0)
             {
                 if(year%4==0)
                 {
                     if (day > 29)
                     {
                         day -= 29;
                         month++;
                     }
                 }
                 else
                 {
                    if(day>28)
                    {
                        day -= 28;
                        month++;
                    }
                 }
             }
             else
             {
                 if(year%400==0)
                 {
                     if (day > 29)
                     {
                         day -= 29;
                         month++;
                     }
                 }
                 else
                 {
                     if(day>28)
                     {
                          day-=28;
                          month++;
                     }
                 }
             }
         }
         else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
         {
            if(day>31){
                day-=31;
                month++;
            }
         }
         else
         {
            if(day>30)
            {
                day-=30;
                month++;
            }
         }
       month+=w;
         if(month>12)
         {
             month-=12;
             year++;
         }
    }
    void modify(Date D)
    {
        day=D.day;
        year=D.year;
        month=D.month;
        if(month==1)
            month1="January";
        else if(month==2)
            month1="February";
        else if(month==3)
            month1="March";
        else if(month==4)
            month1="April";
        else if(month==5)
            month1="May";
        else if(month==6)
            month1="June";
        else if(month==7)
            month1="July";
        else if(month==8)
            month1="August";
        else if(month==9)
            month1="September";
        else if(month==10)
            month1="October";
        else if(month==11)
            month1="November";
        else if(month==12)
            month1="December";
    }
    void Displaydate()
    {
        System.out.println("Modified date: "+month1+" "+day+", "+year);
    }
    void Displaydate2()
    {
        if(month<10)
            System.out.println("Original date: "+day+"-"+"0"+month+"-"+year);
        else
            System.out.println("Original date: "+day+"-"+month+"-"+year);
    }
}
public class Calendar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Date : DD-MM-YYYY");
        System.out.println("Enter Day:");
        int a = s.nextInt();
        System.out.println("Enter Month:");
        int b = s.nextInt();
        System.out.println("Enter Year:");
        int c = s.nextInt();
        Date d = new Date();
        Date d1 = new Date();
        System.out.println("Enter days to be added:");
        int ad=s.nextInt();
        System.out.println("Enter months to be added:");
        int am=s.nextInt();
        System.out.println("Enter years to be added:");
        int ay=s.nextInt();
        d.createDate(a,b,c);
        d.Displaydate2();
        d.modify(ad,am,ay);
        d1.modify(d);
        d1.Displaydate();
    }
}
