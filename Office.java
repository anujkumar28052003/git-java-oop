import java.util.Scanner;
class Employe{
    int Salary;
    String Name;
    int getSalary()
    {
        return Salary;
    }
    String getName()
    {
        return Name;
    }

}
public class Office {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Employe Worker=new Employe();
        System.out.println("Enter name");
        Worker.Name=s.nextLine();
        System.out.println("Enter Salary");
        Worker.Salary=s.nextInt();
        System.out.println(Worker.getName());
        System.out.println(Worker.getSalary());
    }
}
