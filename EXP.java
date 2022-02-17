class DATA{
    public int d=41;
    public void dis()
    {
        System.out.println(d);
        System.out.println("Hello");
    }
}
public class EXP
{
    public static void main(String[] args) {
        DATA e = new DATA();
        e.dis();
        System.out.println(e.d);
    }
}
