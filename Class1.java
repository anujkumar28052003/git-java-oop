public class Class1 {
    class InnerClass1
    {
        public String getString(){
            String s1="InnerClass1: getString invoked.";
            return s1;
        }
        public String getAnotherString(){
            String s2="InnerClass1: getAnotherString invoked.";
            return s2;
        }
    }
    public static void main(String[] args) {
        Class1 obj=new Class1();
        Class1.InnerClass1 in=obj.new InnerClass1();
        System.out.println(in.getString());
        System.out.println(in.getAnotherString());
    }
}
