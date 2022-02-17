import java.util.Scanner;
class Employee
{
    String name;
    String dob;
    String bloodgp;
    String basicpay;
    String telephone;
    String drive;
    String address;

    Employee(String aw,String bw,String cw,String pw,String dw,String ew,String fw)
    {
        name=aw;
        dob=bw;
        bloodgp=cw;
        basicpay=pw;
        telephone=dw;
        drive=ew;
        address=fw;
    }
    String getdataName()
    {
      return name;
    }
    String getdatadob()
    {
        return dob;
    }
    String getdataBlood()
    {
        return bloodgp;
    }
    String getdatabasic()
    {
        return basicpay;
    }
    String getdataTele()
    {
        return telephone;
    }
    String getdataDrive()
    {
        return drive;
    }
    String getdataAddress()
    {
        return address;
    }
    void display(Employee[] y,int x)
    {
        int z=x;
        System.out.print("Employee"+(z+1)+" "+y[z].getdataName()+"   "+y[z].getdatadob()+"       "+y[z].getdataBlood()+"\t        "+y[z].getdatabasic()+"\t    "+y[z].getdataTele()+"        "+y[z].getdataDrive()+"       "+y[z].getdataAddress());
        System.out.println("");
    }
}
public class DATABASE {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of employees :");
        int n=s.nextInt();
        s.nextLine();
        Employee []E=new Employee[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter for employee "+(i+1));
            System.out.println("Enter name :");
            String a=s.nextLine();
            System.out.println("Enter date of birth :");
            String b=s.next();
            System.out.println("Enter blood group:");
            String c=s.next();
            System.out.println("Enter basic pay:");
            String p=s.next();
            System.out.println("Enter Telephone number :");
            String d=s.next();
            System.out.println("Enter Driving License no.:");
            String e=s.next();
            s.nextLine();
            System.out.println("Enter address:");
            String f=s.nextLine();
            E[i]=new Employee(a,b,c,p,d,e,f);
        }
        System.out.println("            Name         DOB          Bloodg       BasicPay     Telephone        License.no        Address");
        for(int j=0;j<n;j++)
        {
            E[j].display(E,j);
        }
    }
}
