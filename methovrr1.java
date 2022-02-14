class A
{
    void disp()
    {
        System.out.println("This is disp from A class ^_^.");
    }
}
class B extends A
{
    void disp()
    {
        System.out.println("This is disp from B class ^_^.");
    }
}
public class methovrr1 extends B 
{
    void disp()
    {
        System.out.println("This is disp from main class ^_^.");
    }    
    public static void main(String[] args) {
        A a1 = new A();
        a1.disp();
        A a2 = new B();
        a2.disp();
        A a3 = new methovrr1();
        a3.disp();;
    }
}
