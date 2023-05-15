LE2_prob2_a_211b172.java
class A{
    public void show(){
        System.out.println("I am A !");
    }
}
LE2_prob2_b_211b172.java
 class B extends A{
    public void show(){
        System.out.println("I am B !");
    }
}
public class Main{
    public static void main(String args[])
    {
        A a=new A();
        a.show();
        B b=new B();
        b.show();
    }
}